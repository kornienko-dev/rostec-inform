package com.kornienko;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    }

    public static <T> Map<T, Long> transform(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
    }
}