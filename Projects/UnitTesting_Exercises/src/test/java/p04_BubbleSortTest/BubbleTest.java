package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {
    @Test
    public void testBubbleSort() {
        int[] numbersToSort = {34, 2, 0, 45, 76, 23, 1, 8, 897, 39, 54};
        Bubble.sort(numbersToSort);
        int[] expectedSortResult = {0, 1, 2, 8, 23, 34, 39, 45, 54, 76, 897};
        Assert.assertArrayEquals(expectedSortResult, numbersToSort);
    }


    // Test case for an already sorted array
    @Test
    public void testSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Bubble.sort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test case for an array sorted in descending order
    @Test
    public void testSortDescendingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Bubble.sort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test case for an array with duplicate elements
    @Test
    public void testSortWithDuplicates() {
        int[] arr = {3, 2, 1, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        Bubble.sort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test case for an empty array
    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Bubble.sort(arr);
        assertArrayEquals(expected, arr);
    }

    // Test case for an array with one element
    @Test
    public void testSortSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        Bubble.sort(arr);
        assertArrayEquals(expected, arr);
    }
}
