package com.apollo.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(10, 30), new Interval(20, 60),
                new Interval(80, 100), new Interval(150, 300));
        ArrayList<Interval> intervals02 = new ArrayList<>(intervals);
        ArrayList<Interval> merge = merge(intervals02);
        System.out.println(merge);
    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 0) return new ArrayList<Interval>();
        int size = intervals.size();
        ArrayList<Interval> res = new ArrayList<>();
        intervals.sort((x, y) -> x.start - y.start);
        int start = intervals.get(0).start, end = intervals.get(0).end;
        for (int i = 1; i < size; i++) {
            Interval curInter = intervals.get(i);
            if (curInter.start > end) {
                res.add(new Interval(start, end));
                start = curInter.start;
            }
            end = curInter.end;
        }
        res.add(new Interval(start, end));
        return res;
    }
}
