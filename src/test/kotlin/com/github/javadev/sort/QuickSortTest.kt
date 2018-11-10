package com.github.javadev.sort

import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class QuickSortTest {
  @Test
  fun test_quick_sort() {
    val quickSort = QuickSort()
    val array = intArrayOf(5, 2, 4, 6, 1, 3, 2, 6)
    quickSort.quickSort(array)
    assertThat(array).contains(1, 2, 2, 3, 4, 5, 6, 6)
  }
  @Test
  fun test_quick_sort_with_empty_array() {
    val quickSort = QuickSort()
    val array = intArrayOf()
    quickSort.quickSort(array)
    assertThat(array).hasSize(0)
  }
  @Test
  fun test_quick_sort_with_one_element() {
    val quickSort = QuickSort()
    val array = intArrayOf(5)
    quickSort.quickSort(array)
    assertThat(array).contains(5)
  }
}
