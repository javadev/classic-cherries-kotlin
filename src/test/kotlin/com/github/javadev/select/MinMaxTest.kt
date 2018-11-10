package com.github.javadev.select

import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class MinMaxTest {
  @Test
  fun test_find_min_max_sorted_array_6() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(6)
    assertThat(minmax.comparisons).isEqualTo(3 * 3 - 2)
  }
  @Test
  fun test_find_min_max_unsorted_array_6() {
    val array = intArrayOf(3, 4, 2, 5, 1, 6)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(6)
    assertThat(minmax.comparisons).isEqualTo(3 * 3 - 2)
  }
  @Test
  fun test_find_min_max_sorted_array_7() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(7)
    assertThat(minmax.comparisons).isEqualTo(3 * 4 - 2)
  }
  @Test
  fun test_find_min_max_unsorted_array_7() {
    val array = intArrayOf(3, 4, 2, 7, 5, 1, 6)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(7)
    assertThat(minmax.comparisons).isEqualTo(3 * 4 - 2)
  }
  @Test
  fun test_find_min_max_sorted_array_3() {
    val array = intArrayOf(3, 2, 1)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(3)
    assertThat(minmax.comparisons).isEqualTo(3 * 2 - 2)
  }
  @Test
  fun test_find_min_max_unsorted_array_3() {
    val array = intArrayOf(6, 2, 7)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(2)
    assertThat(minmax.max).isEqualTo(7)
    assertThat(minmax.comparisons).isEqualTo(3 * 2 - 2)
  }
  @Test
  fun test_find_min_max_sorted_array_2_0() {
    val array = intArrayOf(2, 1)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(2)
    assertThat(minmax.comparisons).isEqualTo(3 * 1 - 2)
  }
  @Test
  fun test_find_min_max_sorted_array_2_1() {
    val array = intArrayOf(1, 2)
    val minmax = MinMax.findMinMax(array, 0, array.size - 1)
    assertThat(minmax.min).isEqualTo(1)
    assertThat(minmax.max).isEqualTo(2)
    assertThat(minmax.comparisons).isEqualTo(3 * 1 - 2)
  }
}
