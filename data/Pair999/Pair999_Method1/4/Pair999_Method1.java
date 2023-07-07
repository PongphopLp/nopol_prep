import java.util.*;

public class Target {

int[] subarray(int[] original,int start,int end){
  int[] copy=new int[end - start + 1];
  int j=0;
  for (int i=start; i <= end; i++) {
    copy[j]=original[i];
    j++;
  }
  return copy;
}
  int[] __target__(int[] original,int start,int end){
  int[] copy=new int[end + start + 1];
  int j=0;
  for (int i=start; i <= end; i++) {
    copy[j]=original[i];
    j++;
  }
  return copy;
}

}