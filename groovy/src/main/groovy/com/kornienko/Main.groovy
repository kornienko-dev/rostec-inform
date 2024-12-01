package com.kornienko

class Main {
    static void main(String[] args) {
    }

    static <T> Map<T, Long> transform(T[] array) {
        array.toList()
                .groupBy { it }
                .collectEntries { k, v -> [(k): v.size().toLong()] }
    }
}
