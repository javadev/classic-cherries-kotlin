package com.github.javadev.select

/**
 * Quickselect is a selection algorithm to find the kth smallest element
 * in an unordered list. It is related to the quicksort sorting algorithm
 */
/*
public class QuickSelect {

  public Integer quickSelect(int[] array, int k) {
    return quickSelect(array, 0, array.length - 1, k);
  }

  Integer quickSelect(int[] array, int low, int high, int k) {
    if (k < 1 || k > array.length) {
      return null;
    }
    if (low == high) {
      return array[low];
    }

    int p = partition(array, low, high);
    int leftSize = p - low + 1;

    if (leftSize == k) {
      return array[p];
    } else if (k < leftSize) {
      return quickSelect(array, low, p - 1, k);
    } else {
      return quickSelect(array, p + 1, high, k - leftSize);
    }
  }

  int partition(int[] array, int first, int last) {
    int pivot = array[first];
    int low = first + 1;
    int high = last;

    while (low < high) {

      // Search forward from left
      while (low <= high && array[low] <= pivot) {
        low++;
      }

      // Search backward from right
      while (low <= high && array[high] > pivot) {
        high--;
      }

      // Swap two elements in the list
      if (high > low) {
        swap(array, low, high);
      }
    }

    while (high > first && array[high] >= pivot) {
      high--;
    }

    // Swap pivot with list[high]
    if (pivot > array[high]) {
      array[first] = array[high];
      array[high] = pivot;
      return high;
    } else {
      return first;
    }
  }

  void swap(int[] a, int l, int r) {
    int v = a[l];
    a[l] = a[r];
    a[r] = v;
  }

}
*/

class QuickSelect {
  fun quickSelect(array:IntArray, k:Int):Int? {
    return quickSelect(array, 0, array.size - 1, k)
  }
  internal fun quickSelect(array:IntArray, low:Int, high:Int, k:Int):Int? {
    if (k < 1 || k > array.size)
    {
      return null
    }
    if (low == high)
    {
      return array[low]
    }
    val p = partition(array, low, high)
    val leftSize = p - low + 1
    if (leftSize == k)
    {
      return array[p]
    }
    else if (k < leftSize)
    {
      return quickSelect(array, low, p - 1, k)
    }
    else
    {
      return quickSelect(array, p + 1, high, k - leftSize)
    }
  }
  internal fun partition(array:IntArray, first:Int, last:Int):Int {
    val pivot = array[first]
    var low = first + 1
    var high = last
    while (low < high)
    {
      // Search forward from left
      while (low <= high && array[low] <= pivot)
      {
        low++
      }
      // Search backward from right
      while (low <= high && array[high] > pivot)
      {
        high--
      }
      // Swap two elements in the list
      if (high > low)
      {
        swap(array, low, high)
      }
    }
    while (high > first && array[high] >= pivot)
    {
      high--
    }
    // Swap pivot with list[high]
    if (pivot > array[high])
    {
      array[first] = array[high]
      array[high] = pivot
      return high
    }
    else
    {
      return first
    }
  }
  internal fun swap(a:IntArray, l:Int, r:Int) {
    val v = a[l]
    a[l] = a[r]
    a[r] = v
  }
}
