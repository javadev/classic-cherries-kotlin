package com.github.javadev.sort

class HeapSort {
  fun sort(array:IntArray, size:Int) {
    build_heap(array, size)
    for (i in size - 1 downTo 1)
    {
      swap(array, 0, i)
      heapify(array, i, 0)
    }
  }
  internal fun build_heap(array:IntArray, size:Int) {
    for (i in size / 2 downTo 0)
    {
      heapify(array, size, i)
    }
  }
  internal fun heapify(array:IntArray, size:Int, i:Int) {
    val l = left(i)
    val r = right(i)
    if ((l < size) && (array[l] > array[i]))
    {
      swap(array, i, l)
      heapify(array, size, l)
    }
    if ((r < size) && (array[r] > array[i]))
    {
      swap(array, i, r)
      heapify(array, size, r)
    }
  }
  internal fun parent(i:Int):Int {
    return (i - 1) / 2
  }
  internal fun left(i:Int):Int {
    return 2 * i + 1
  }
  internal fun right(i:Int):Int {
    return 2 * i + 2
  }
  internal fun swap(array:IntArray, i:Int, j:Int) {
    val value = array[i]
    array[i] = array[j]
    array[j] = value
  }
}
