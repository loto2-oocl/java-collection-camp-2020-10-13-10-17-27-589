package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        final int arraySize = this.arrayList.size();
        return (double)this.arrayList.stream().reduce(0, Integer::sum) / arraySize;
    }

    public int getMaxValue() {
        return this.arrayList.stream()
            .reduce(Integer::max).orElse(null);
    }

    public int getLastOdd() {
        return this.arrayList.stream()
            .reduce(
                (current, next) -> {
                    return next % 2 != 0 ? next : current;
                }).orElse(null);
    }
}
