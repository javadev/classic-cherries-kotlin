package com.github.javadev
import org.fest.assertions.Assertions.assertThat
import org.junit.Test

class HeapSortTest {

  @Test
  fun test_heap_sort_0() {
    val heapSort = HeapSort()
    val array = intArrayOf(17, 3, 19, 2, 7, 25, 100, 1, 36)
    heapSort.sort(array, array.size)
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
  fun test_heap_sort_1() {
    val heapSort = HeapSort()
    val array = intArrayOf(100, 36, 19, 25, 17, 7, 3, 2, 1)
    heapSort.sort(array, array.size)
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
  fun test_heap_sort_2() {
    val heapSort = HeapSort()
    val array = intArrayOf(100, 36, 19, 100, 25, 17, 7, 3, 2, 1, 25)
    heapSort.sort(array, array.size)
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
  fun test_heap_sort_3() {
    val heapSort = HeapSort()
    val array = intArrayOf(17)
    heapSort.sort(array, array.size)
    assertThat(array).isNotNull().hasSize(1)
    assertThat(array[0]).isEqualTo(17)
  }

  @Test
  fun test_heap_sort_4() {
    val heapSort = HeapSort()
    val array = intArrayOf()
    heapSort.sort(array, array.size)
    assertThat(array).isNotNull().hasSize(0)
  }

  @Test
  fun test_build_heap() {
    val heapSort = HeapSort()
    val array = intArrayOf(17, 3, 19, 2, 7, 25, 100, 1, 36)
    heapSort.build_heap(array, array.size)
    assertThat(array).isNotNull().hasSize(9)
    assertThat(array[0]).isEqualTo(100)
    assertThat(array[1]).isEqualTo(17)
    assertThat(array[2]).isEqualTo(36)
    assertThat(array[3]).isEqualTo(3)
    assertThat(array[4]).isEqualTo(7)
    assertThat(array[5]).isEqualTo(19)
    assertThat(array[6]).isEqualTo(25)
    assertThat(array[7]).isEqualTo(1)
    assertThat(array[8]).isEqualTo(2)
  }

  @Test
  fun test_heapify_0() {
    val heapSort = HeapSort()
    val array = intArrayOf(3, 17, 19)
    heapSort.heapify(array, array.size, 0)
    assertThat(array).isNotNull().hasSize(3)
    assertThat(array[0]).isEqualTo(19)
    assertThat(array[1]).isEqualTo(3)
    assertThat(array[2]).isEqualTo(17)
  }

  @Test
  fun test_restore_with_known_value_1() {
    val heapSort = HeapSort()
    val array = intArrayOf(1, 2, 7, 3, 4, 5, 6, 8, 9)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  @Test
  fun test_restore_with_known_value_2() {
    val heapSort = HeapSort()
    val array = intArrayOf(1, 2, 4, 5, 6, 7, 3, 8, 9)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  @Test
  fun test_restore_with_known_value_3() {
    val heapSort = HeapSort()
    val array = intArrayOf(2, 4, 6, 1, 10, 12, 14, 16, 18, 20)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(1, 2, 4, 6, 10, 12, 14, 16, 18, 20))
  }

  @Test
  fun test_restore_with_known_value_4() {
    val heapSort = HeapSort()
    val array = intArrayOf(2, 4, 6, 3, 10, 12, 14, 16, 18, 20)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(2, 3, 4, 6, 10, 12, 14, 16, 18, 20))
  }

  @Test
  fun test_restore_with_known_value_5() {
    val heapSort = HeapSort()
    val array = intArrayOf(2, 4, 6, 23, 10, 12, 14, 16, 18, 20)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(2, 4, 6, 10, 12, 14, 16, 18, 20, 23))
  }

  @Test
  fun test_restore_with_known_value_6() {
    val heapSort = HeapSort()
    val array = intArrayOf(23, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(4, 6, 8, 10, 12, 14, 16, 18, 20, 23))
  }

  @Test
  fun test_restore_with_known_value_7() {
    val heapSort = HeapSort()
    val array = intArrayOf(3, 4, 6, 8, 10, 12, 14, 16, 18, 20, 2)
    heapSort.sort(array, array.size)
    assertThat(array).isEqualTo(intArrayOf(2, 3, 4, 6, 8, 10, 12, 14, 16, 18, 20))
  }
}
