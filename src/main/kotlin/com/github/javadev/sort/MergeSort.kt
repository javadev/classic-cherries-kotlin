package com.github.javadev.sort

import java.util.Arrays

class MergeSort {
  fun mergeSort(array:IntArray) {
    mergeSort(array, 0, array.size - 1)
  }
  internal fun mergeSort(array:IntArray, low:Int, high:Int) {
    if (high - low < 2)
    {
      return
    }
    if (low < high)
    {
      val mid = low + (high - low) / 2
      mergeSort(array, low, mid)
      mergeSort(array, mid + 1, high)
      merge(array, low, mid, high)
    }
  }
  internal fun merge(array:IntArray, low:Int, mid:Int, high:Int) {
    val b = Arrays.copyOfRange(array, low, mid)
    var i = low
    var j = mid
    var k = 0
    while (k < b.size)
    {
      if (j == high || b[k] < array[j])
      {
        array[i] = b[k++]
      }
      else
      {
        array[i] = array[j++]
      }
      i++
    }
  }
  internal fun merge(a:IntArray, b:IntArray):IntArray {
    val answer = IntArray(a.size + b.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < a.size && j < b.size)
    {
      if (a[i] < b[j])
      {
        answer[k++] = a[i++]
      }
      else
      {
        answer[k++] = b[j++]
      }
    }
    while (i < a.size)
    {
      answer[k++] = a[i++]
    }
    while (j < b.size)
    {
      answer[k++] = b[j++]
    }
    return answer
  }
}
