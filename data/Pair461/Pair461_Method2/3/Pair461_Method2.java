import java.util.*;

public class Target {

int[] resizeIntArray(int[] i,int size){
  int[] j=new int[size];
  if (size > i.length)   size=i.length;
  System.arraycopy(i,0,j,0,size);
  return j;
}
  int[] __target__(int[] i,int size){
  int[] j=new int[size];
  if (size >= i.length)   size=i.length;
  System.arraycopy(i,0,j,0,size);
  return j;
}

}