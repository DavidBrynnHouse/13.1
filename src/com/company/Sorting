package com.company;

import java.util.ArrayList;

public class Sorting {
        public static void main(String[] args) {
            ArrayList<Number> list = new ArrayList<>();
            for (int i = 0; i < 10; i++)
                list.add(Math.random() * 10);

            sort(list);
            System.out.println();
            for(Number e: list)
                System.out.println(e);
        }

        public static void sort(ArrayList<Number> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                Number min =  list.get(i);
                int index = i;

                for (int j = i + 1; j < list.size(); j++) {
                    if (min.intValue() > list.get(j).intValue()) {
                        min = list.get(j);
                        index = j;
                    }
                }

                if (index != i) {
                    list.set(index, list.get(i));
                    list.set(i, min);
                }
            }
        }
}
