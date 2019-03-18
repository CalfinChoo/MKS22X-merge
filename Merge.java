public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    msH(data, data, 0, data.length);
  }
  public static void msH(int[] data, int lo, int hi) {
    int[] temp = new int[hi - lo + 1];
    if (hi > lo) {
      msH(data, lo, (hi - lo) / 2);
      msH(data, (hi - lo) / 2 + 1, hi);
    }
    int count = 0;
    for (int i = lo; i <= hi; i++, count++) {
      temp[count] = data[i];
    }

  }
  public static void msH(int[] data, int[] temp, int lo, int hi) {
    if (hi > lo) {
      msH(data, temp, lo, (hi - lo) / 2);
      msH(data, temp, (hi - lo) / 2, hi);
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
