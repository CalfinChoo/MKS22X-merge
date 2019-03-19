public class Merge {
  public static void main(String[] args) {
    int[] testAry = {9, 6, 2, 5, 1, 0, 6, 7, 7 , 9, 15, 16, 34, 76, 98, 109, 607, 45, 21, 32};
    mergesort(testAry);
    for (int i = 0; i < testAry.length; i++) {
      System.out.print(testAry[i] + " ");
    }
  }
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    msH(data, 0, data.length - 1);
  }
  public static void msH(int[] data, int lo, int hi) {
    if (hi > lo) {  // runs when not base case
      int[] left = subarray(data, lo, (hi + lo) / 2 + 1);  // stores left subarray of a side
      int[] right = subarray(data, (hi + lo) / 2 + 1, hi + 1);  // store right subarray of a side
      msH(left, 0, left.length - 1); // recursively calls method on left side then the right side
      msH(right, 0, right.length - 1);
      // merges the left and right side back together in order
      int l = 0, r = 0;  // ints to keep track of indices of left and right arrays
      for (int mergeCount = 0; mergeCount < left.length + right.length; mergeCount++) { // loop to fill in merged array based on left and right subarrays
        if (l < left.length && r < right.length) { // while BOTH left and right arrays have more ints
          if (left[l] < right[r]) { // if int in left < int in right, add left index and increment index
            data[mergeCount] = left[l];
            l++;
          }
          else { // otherwise add the other index and increment
            data[mergeCount] = right[r];
            r++;
          }
        }
        else if (l < left.length) { // when only one side has ints
          data[mergeCount] = left[l];
          l++;
        }
        else if (r < right.length) {
          data[mergeCount] = right[r];
          r++;
        }
      }
    }
  }
  public static void msH(int[] data, int[] temp, int lo, int hi) {

  }
  public static int[] subarray(int[] data, int start, int end) {
    int[] ary = new int[end - start];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = data[start];
      start++;
    }
    return ary;
  }
}
