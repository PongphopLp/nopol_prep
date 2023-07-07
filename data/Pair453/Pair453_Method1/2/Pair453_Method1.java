import java.util.*;

public class Target {

int[] shrink(int[] arr,int newSize){
  if (arr.length == newSize)   return arr;
  int[] newArr=new int[newSize];
  System.arraycopy(arr,0,newArr,0,newSize);
  return newArr;
}
  int[] __target__(int[] arr,int newSize){
  if (arr.length != newSize)   return arr;
  int[] newArr=new int[newSize];
  System.arraycopy(arr,0,newArr,0,newSize);
  return newArr;
}

}