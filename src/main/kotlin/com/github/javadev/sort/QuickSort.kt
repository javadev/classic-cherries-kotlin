package com.github.javadev.sort

class QuickSort {
  fun quickSort(array:IntArray) {
    quickSort(array, 0, array.size - 1)
  }
  internal fun quickSort(array:IntArray, low:Int, high:Int) {
    if (low < high)
    {
      val p = partition(array, low, high)
      quickSort(array, low, p)
      quickSort(array, p + 1, high)
    }
  }
  // Partition the array list[first..last]
  internal fun partition(list:IntArray, first:Int, last:Int):Int {
    val pivot = list[first] // Choose the first element as the pivot
    var low = first + 1 // Index for forward search
    var high = last // Index for backward search
    while (high > low)
    {
      // Search forward from left
      while (low <= high && list[low] <= pivot)
      {
        low++
      }
      // Search backward from right
      while (low <= high && list[high] > pivot)
      {
        high--
      }
      // Swap two elements in the list
      if (high > low)
      {
        swap(list, low, high)
      }
    }
    while (high > first && list[high] >= pivot)
    {
      high--
    }
    // Swap pivot with list[high]
    if (pivot > list[high])
    {
      list[first] = list[high]
      list[high] = pivot
      return high
    }
    else
    {
      return first
    }
  }
  internal fun swap(array:IntArray, low:Int, high:Int) {
    val value = array[low]
    array[low] = array[high]
    array[high] = value
  }
}
