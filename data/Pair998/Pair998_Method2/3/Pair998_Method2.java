import java.util.*;

public class Target {

int[] subarray(int[] source,int pos,int length){
  int dest[]=new int[length];
  for (int i=0; i < length; i++)   dest[i]=source[pos + i];
  return dest;
}
  int[] __target__(int[] source,int pos,int length){
  int dest[]=new int[length];
  for (int i=0; i <= length; i++)   dest[i]=source[pos + i];
  return dest;
}

}