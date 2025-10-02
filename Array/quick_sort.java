// Steps of Quick Sort:

// 1 . Choose a pivot element (commonly the last element, first element, or middle).

// 2 . Partition the array: place pivot at its correct position, and arrange smaller numbers to its left, larger to its right.

// 3 . Recursively apply the above steps to the left and right subarrays.

// 4 . The base case is when the subarray has 0 or 1 element (already sorted).

/*Time Complexity of Quick Sort

Best Case: O(n log n) → pivot divides array into equal halves.

Average Case: O(n log n) → good pivot selection.

Worst Case: O(n^2) → pivot is always the smallest or largest element (array becomes unbalanced).*/


