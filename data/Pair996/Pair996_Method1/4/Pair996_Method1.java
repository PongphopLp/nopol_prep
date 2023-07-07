import java.util.*;

public class Target {

int[] copy(int[] arr,int begin,int end){
  int n=end - begin;
  int[] result=new int[n];
  for (int i=begin; i < end; ++i) {
    result[i - begin]=arr[i];
  }
  return result;
}
  int[] __target__(int[] arr,int begin,int end){
  int n=end - begin;
  int[] result=new int[n];
  for (int i=begin; i <= end; ++i) {
    result[i - begin]=arr[i];
  }
  return result;
}

}