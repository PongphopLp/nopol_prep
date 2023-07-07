import java.util.*;

public class Target {

int[] removeIndex(int[] array,int index){
  int newLength=array.length - 1;
  int[] newArray=new int[newLength];
  System.arraycopy(array,0,newArray,0,index);
  if (index < newLength) {
    System.arraycopy(array,index + 1,newArray,index,newLength - index);
  }
  return newArray;
}
  int[] __target__(int[] array,int index){
  int newLength=array.length - 1;
  int[] newArray=new int[newLength];
  System.arraycopy(array,0,newArray,0,index);
  if (index < newLength) {
    System.arraycopy(array,index + 1,newArray,index,newLength + index);
  }
  return newArray;
}

}