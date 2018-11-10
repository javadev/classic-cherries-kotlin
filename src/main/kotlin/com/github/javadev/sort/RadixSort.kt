package com.github.javadev.sort

class RadixSort {
  fun sort_lsd(array:IntArray) {
    val bins = IntArray(10)
    val array2 = IntArray(array.size)
    var mod = 10
    var div = 1
    while (true)
    {
      for (i in array.indices)
      {
        val bin = radix(array[i], mod, div)
        bins[bin]++
      }
      for (i in 1 until bins.size)
      {
        bins[i] = bins[i] + bins[i - 1]
      }
      for (i in array.indices.reversed())
      {
        val bin = radix(array[i], mod, div)
        val idx = --bins[bin]
        array2[idx] = array[i]
      }
      for (i in array2.indices)
      {
        array[i] = array2[i]
        array2[i] = 0
      }
      mod *= 10
      div *= 10
      if (!should_continue(array, mod))
      {
        return
      }
      else
      {
        for (i in bins.indices)
        {
          bins[i] = 0
        }
      }
    }
  }
  internal fun radix(value:Int, mod:Int, div:Int):Int {
    return value % mod / div
  }
  internal fun should_continue(array:IntArray, mod:Int):Boolean {
    for (i in array.indices)
    {
      if (array[i] >= (mod / 10))
      {
        return true
      }
    }
    return false
  }
}
