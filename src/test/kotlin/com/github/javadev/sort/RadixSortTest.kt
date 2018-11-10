package com.github.javadev

import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class RadixSortTest {
  @Test
  fun test_radix_sort_0() {
    val radixSort = RadixSort()
    val array = intArrayOf(17, 3, 19, 2, 7, 25, 100, 1, 36)
    radixSort.sort_lsd(array)
    assertThat(array).isNotNull().hasSize(9)
    assertThat(array[8]).isEqualTo(100)
    assertThat(array[7]).isEqualTo(36)
    assertThat(array[6]).isEqualTo(25)
    assertThat(array[5]).isEqualTo(19)
    assertThat(array[4]).isEqualTo(17)
    assertThat(array[3]).isEqualTo(7)
    assertThat(array[2]).isEqualTo(3)
    assertThat(array[1]).isEqualTo(2)
    assertThat(array[0]).isEqualTo(1)
  }
  @Test
  fun test_radix_sort_1() {
    val radixSort = RadixSort()
    val array = intArrayOf(100, 36, 19, 25, 17, 7, 3, 2, 1)
    radixSort.sort_lsd(array)
    assertThat(array).isNotNull().hasSize(9)
    assertThat(array[8]).isEqualTo(100)
    assertThat(array[7]).isEqualTo(36)
    assertThat(array[6]).isEqualTo(25)
    assertThat(array[5]).isEqualTo(19)
    assertThat(array[4]).isEqualTo(17)
    assertThat(array[3]).isEqualTo(7)
    assertThat(array[2]).isEqualTo(3)
    assertThat(array[1]).isEqualTo(2)
    assertThat(array[0]).isEqualTo(1)
  }
  @Test
  fun test_radix_sort_2() {
    val radixSort = RadixSort()
    val array = intArrayOf(100, 36, 19, 100, 25, 17, 7, 3, 2, 1, 25)
    radixSort.sort_lsd(array)
    assertThat(array).isNotNull().hasSize(11)
    assertThat(array[10]).isEqualTo(100)
    assertThat(array[9]).isEqualTo(100)
    assertThat(array[8]).isEqualTo(36)
    assertThat(array[7]).isEqualTo(25)
    assertThat(array[6]).isEqualTo(25)
    assertThat(array[5]).isEqualTo(19)
    assertThat(array[4]).isEqualTo(17)
    assertThat(array[3]).isEqualTo(7)
    assertThat(array[2]).isEqualTo(3)
    assertThat(array[1]).isEqualTo(2)
    assertThat(array[0]).isEqualTo(1)
  }
  @Test
  fun test_radix_sort_3() {
    val radixSort = RadixSort()
    val array = intArrayOf(17)
    radixSort.sort_lsd(array)
    assertThat(array).isNotNull().hasSize(1)
    assertThat(array[0]).isEqualTo(17)
  }
  @Test
  fun test_radix_sort_4() {
    val radixSort = RadixSort()
    val array = intArrayOf()
    radixSort.sort_lsd(array)
    assertThat(array).isNotNull().hasSize(0)
  }
}
