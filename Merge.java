public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    msH(data, data, 0, data.length);
  }
  public static void msH(int[] data, int[] temp, int lo, int hi) {
    if (hi > lo) {
      msH(data, data.subarray(lo, (hi - lo) / 2), lo, (hi - lo) / 2);
      msH(data, data.subarray((hi - lo) / 2, hi), (hi - lo) / 2, hi);
    }
  }
  public static int[] subarray(int start, int end) {
    int[] ary = new ary[end - start];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = ary[start];
      start++;
    }
    return ary;
  }
}
