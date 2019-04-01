package main;

/**
 * Magic index i -> array[i]=i
 * find a magic index in a sorted array of distinct numbers, if it exists
 * followups :
 * when array is not sorted
 * find all magic indexes
 * non-distinct numbers
 */
public class MagicIndex {

    // we know 3 imp things - array is sorted, numbers are distinct AND we just have to return any 1 magic index
    // hence we can use binary search
    public int soltionOne(int[] input, int start, int end) {

        if (start < 0 || end >= input.length || start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (input[mid] == mid) {
            return mid;
        } else if (input[mid] < mid) {
            // input[5]=3
            return soltionOne(input, mid + 1, end);
        } else {
            // input[5]=9
            return soltionOne(input, start, mid - 1);
        }
    }

    // TODO followups
}
