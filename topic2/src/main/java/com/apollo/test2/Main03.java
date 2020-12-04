package com.apollo.test2;

import java.util.*;

public class Main03 {

    private static TreeMap<Integer, String> map = new TreeMap<>();
    private static TreeSet<Integer> removeDesc = new TreeSet<>();
    private static int num = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine().trim());
            for (int j = 0; j < n; j++) {
                String[] commandLine = scanner.nextLine().trim().split(" ");
                switch (commandLine[0]) {
                    case "open":
                        int fileDesc = open(commandLine[1]);
                        System.out.println(fileDesc);
                        break;
                    case "dup":
                        int fileNewDesc = dup(Integer.parseInt(commandLine[1]));
                        System.out.println(fileNewDesc);
                        break;
                    case "dup2":
                        dup2(Integer.parseInt(commandLine[1]), Integer.parseInt(commandLine[2]));
                        break;
                    case "close":
                        close(Integer.parseInt(commandLine[1]));
                        break;
                    case "query":
                        String fileName = query(Integer.parseInt(commandLine[1]));
                        System.out.println(fileName);
                        break;
                }

            }

            map = new TreeMap<>();
            removeDesc = new TreeSet<>();
            num = 0;
        }
    }
    
    private static int findMinFileDesc() {
        if (removeDesc.isEmpty()) {
            return num++;
        } else {
            Integer minFileName = removeDesc.higher(-1);
            removeDesc.remove(minFileName);
            return minFileName;
        }
        // return -1;
    }

    public static int open(String fileName) {
        int fileDesc = findMinFileDesc();
        map.put(fileDesc, fileName);

        return fileDesc;
    }

    public static int dup(int fileDesc) {
        String fileName = map.get(fileDesc);
        int fileNewDesc = findMinFileDesc();
        map.put(fileNewDesc, fileName);

        return fileNewDesc;
    }

    public static void dup2(int fileDesc, int newFileDesc) {
        map.put(newFileDesc, map.get(fileDesc));
    }

    public static void close(int fileDesc) {
        map.remove(fileDesc);
        removeDesc.add(fileDesc);
    }

    public static String query(int fileDesc) {
        return map.get(fileDesc);
    }

}
