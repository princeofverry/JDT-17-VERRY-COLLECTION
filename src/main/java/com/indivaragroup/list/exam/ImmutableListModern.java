package com.indivaragroup.list.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListModern {
    public static void main(String[] args) {
        List list1 = Collections.emptyList();

        List list2 = Collections.singletonList("Apel");

        // immutable list
        List list3 = List.of("Joko", "widodo", "mangga");

        List exitingList = new ArrayList<>();
        exitingList.add("Pisang");
        exitingList.add("Jeruk");
        List list4 = Collections.unmodifiableList(exitingList);

        list3.forEach(item -> System.out.println(item));

        list4.forEach(System.out::println);
    }
}
