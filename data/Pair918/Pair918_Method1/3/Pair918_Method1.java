import java.util.*;

public class Target {

int _partition(int[] array,int start,int end){
  int left=start;
  int right=end;
  int pivot=start;
  int pivot_key=array[pivot];
  while (true) {
    while (array[right] > pivot_key)     right--;
    while (array[left] < pivot_key)     left++;
    if (left < right) {
      int temp=array[left];
      array[left]=array[right];
      array[right]=temp;
    }
 else {
      return right;
    }
  }
}
  int __target__(int[] array,int start,int end){
  int left=start;
  int right=end;
  int pivot=start;
  int pivot_key=array[pivot];
  while (true) {
    while (array[right] <= pivot_key)     right--;
    while (array[left] < pivot_key)     left++;
    if (left < right) {
      int temp=array[left];
      array[left]=array[right];
      array[right]=temp;
    }
 else {
      return right;
    }
  }
}

}