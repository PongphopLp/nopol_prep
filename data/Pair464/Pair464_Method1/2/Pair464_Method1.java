import java.util.*;

public class Target {

int[] expandArray(int[] array,int size){
  int[] temp=new int[size];
  System.arraycopy(array,0,temp,0,array.length);
  for (int j=array.length; j < size; j++)   temp[j]=0;
  return temp;
}
  int[] __target__(int[] array,int size){
  int[] temp=new int[size];
  for (int j=array.length; j < size; j++)   temp[j]=0;
  return temp;
}

}