package com.github.javadev.sort

import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class MergeSortTest {
  @Test
  fun test_merge_sort() {
    val mergeSort = MergeSort()
    val array = intArrayOf(5, 2, 4, 6, 1, 3, 2, 6)
    mergeSort.mergeSort(array)
    assertThat(array).contains(1, 2, 2, 3, 4, 5, 6, 6)
  }
}
