static void main(String[] args) {
    println(transform([1, 3, 4, 5, 1, 5, 4] as Integer[]))
}

static <T> Map<T, Long> transform(T[] array) {
    array.toList()
            .groupBy { it }
            .collectEntries { k, v -> [(k): v.size().toLong()] }
}
