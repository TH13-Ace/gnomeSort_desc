fun gnomeSortDescending(arr: MutableList<Int>): Pair<Int, Int> {
    var comparisons = 0
    var swaps = 0
    var index = 0

    while (index < arr.size) {
        comparisons++
        if (index == 0 || arr[index] >= arr[index - 1]) {
            index++
        } else {
            // Swap
            val temp = arr[index]
            arr[index] = arr[index - 1]
            arr[index - 1] = temp
            swaps++
            index--
        }
    }

    return Pair(comparisons, swaps)
}

fun main() {
    val numbers = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    
    println("Original list: $numbers")
    
    val (comparisons, swaps) = gnomeSortDescending(numbers)
    
    println("Sorted list (descending): $numbers")
    println("Total comparisons: $comparisons")
    println("Total swaps: $swaps")
}