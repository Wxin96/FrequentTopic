package com.apollo.ip;

public class IPCheck02 {

    public static void main(String[] args) {
        System.out.println(isIpv4("10.0.0.1"));
    }

    public static boolean isIpv4(String ip) {
        String[] ips = ip.split("\\.");
        if (ips.length != 4) return false;
        for (int i = 0; i < ips.length; i++) {
            if (!isIpv4Group(ips[i])) return false;
        }
        return true;
    }

    public static boolean isIpv4Group(String ipg) {
        if (ipg == null || ipg.length() <= 0 || ipg.length() > 3) return false;
        for (int i = 0; i < ipg.length(); i++) {
            if (ipg.charAt(i) < '0' || ipg.charAt(i) >'9') return false;
        }
        int num = Integer.parseInt(ipg);
        if (num >= 256 || ipg.charAt(0) == '0' && ipg.length() > 1) {
            return false;
        }
        return true;
    }

}
