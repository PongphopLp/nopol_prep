import java.util.*;

public class Target {

int[] copy(int[] array,int fromIndex,int toIndex){
  int[] array2=new int[toIndex - fromIndex];
  for (int i=fromIndex; i < toIndex; i++)   array2[i - fromIndex]=array[i];
  return array2;
}
  int[] __target__(int[] array,int fromIndex,int toIndex){
  int[] array2=new int[toIndex - fromIndex];
  for (int i=fromIndex; i < toIndex; i--)   array2[i - fromIndex]=array[i];
  return array2;
}

}