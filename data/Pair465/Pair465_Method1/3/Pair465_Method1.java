import java.util.*;

public class Target {

int ElemOccurs(int elem,int[] arr){
  for (int i=arr.length; i-- > 0; )   if (arr[i] == elem)   return i;
  return -1;
}
  int __target__(int elem,int[] arr){
  for (int i=arr.length; i-- > 0; )   if (arr[i] == elem)   return i;
  return 1;
}

}