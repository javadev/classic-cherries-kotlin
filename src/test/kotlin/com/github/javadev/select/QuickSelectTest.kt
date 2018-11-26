package com.github.javadev.select

import org.fest.assertions.Assertions.assertThat
import org.junit.Test
/**
* Created by dpaukov
*/
class QuickSelectTest {
  @Test
  fun test_in_sorted_list() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val value = quickSelect.quickSelect(array, 4)
    assertThat(value).isEqualTo(4)
  }
  @Test
  fun test_unsorted_list() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(2, 5, 3, 6, 1, 4, 7)
    val value = quickSelect.quickSelect(array, 4)
    assertThat(value).isEqualTo(4)
  }
  @Test
  fun test_sorted_list_last_element() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val value = quickSelect.quickSelect(array, 7)
    assertThat(value).isEqualTo(7)
  }
  @Test
  fun test_sorted_list_first_element() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    val value = quickSelect.quickSelect(array, 1)
    assertThat(value).isEqualTo(0)
  }
  @Test
  fun test_not_found() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    val value = quickSelect.quickSelect(array, 10)
    assertThat(value).isEqualTo(null)
  }
  @Test
  fun test_normal_element() {
    val quickSelect = QuickSelect()
    val array = intArrayOf(0, 100, 2, 3, 1, 4, 5, 6, 7)
    val value = quickSelect.quickSelect(array, 2)
    assertThat(value).isEqualTo(1)
  }
}