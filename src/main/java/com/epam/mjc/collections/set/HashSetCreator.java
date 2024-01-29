package com.epam.mjc.collections.set;

import javax.swing.*;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer i : sourceList) {
            if (i % 2 == 1) {
                set.add(i);
                set.add(2 * i);
            } else {
                int temp = i;
                set.add(temp);
                while (temp % 2 == 0) {
                    temp = temp / 2;
                    set.add(temp);
                }
            }
        }
        return set;
    }
}
