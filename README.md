# Average Calculation in Java

This repository contains a simple Java program to compute the average of a subarray of integers starting from a specific index `k`. It includes the implementation of the `Average` class and corresponding test cases using **JUnit**.

## Overview

The program is divided into multiple parts as described below:

---

## Part A: Brief Functional Description

The `calcAverage` method computes the average of a subarray of integers from an array. The subarray includes elements starting from index `k` to the end of the array. If the subarray exists (`n > 0`), it calculates the average using integer division. If `k` is out of bounds or the subarray is empty, the method returns `0`.

---

## Part B: Functional Test Cases

Functional test cases validate the method with various arrays and starting indices (`k`).

```java
// Examples from Average.java main method
int[] list1 = {1, 3, 5, 7, 9};
int result1 = avg.calcAverage(4, list1); // Expected output: 9

int[] list2 = {2, 4, 6, 8, 10};
int result2 = avg.calcAverage(3, list2); // Expected output: 8

int[] list3 = {12, 45, 56, 89, 20};
int result3 = avg.calcAverage(5, list3); // Expected output: 0


Part C: Partitions and Test Cases
The input is partitioned based on:

Valid subarray (n > 0): k is within bounds (0 ≤ k < list.length).
Empty subarray (n == 0): k is out of bounds (k ≥ list.length).
Test cases cover these partitions:

Partition 1: Valid range (k = 0, list = {1, 2, 3}).
Partition 2: Out of bounds (k = 4, list = {1, 2, 3}).


Part D: Boundary Value Test Cases
Boundary test cases focus on edge values for k:
// Boundary Test Cases
int[] list4 = {10, 20, 30};
int result4 = avg.calcAverage(0, list4); // Expected output: 20

int[] list5 = {5, 15, 25};
int result5 = avg.calcAverage(4, list5); // Expected output: 0


Part E: JUnit Implementation
JUnit test cases validate the functionality of the calcAverage method.
import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTest {

    @Test
    public void testAverage() {
        // Create an instance of Average
        Average avg = new Average();

        // Functional test cases
        assertEquals(6, avg.calcAverage(0, new int[]{2, 4, 6, 8, 10}));
        assertEquals(4, avg.calcAverage(2, new int[]{1, 2, 3, 4, 5}));
        assertEquals(40, avg.calcAverage(3, new int[]{10, 20, 30, 40}));
        assertEquals(0, avg.calcAverage(5, new int[]{5, 15, 25, 35}));
        assertEquals(0, avg.calcAverage(4, new int[]{5, 15, 25}));

        // Boundary test cases
        assertEquals(20, avg.calcAverage(0, new int[]{10, 20, 30}));
        assertEquals(0, avg.calcAverage(3, new int[]{5, 15, 25}));
    }
}


Part F: Fixed Out-of-Bounds Error
The calcAverage method has been updated to handle out-of-bounds cases correctly. If k exceeds the array length, the method immediately returns 0.
public int calcAverage(int k, int[] list) {
    if (k >= list.length) {  
        return 0; // Out of bounds, return 0
    }

    int sum = 0;
    int count = 0;

    for (int i = k; i < list.length; i++) {  // Start from k to the end of the array
        sum += list[i];
        count++;
    }

    return (count > 0) ? (sum / count) : 0;
}


Part G: Code Coverage
![TestCoverageHW3](https://github.com/user-attachments/assets/7403aa6b-373f-4edb-9c06-ce594bcd6620)
