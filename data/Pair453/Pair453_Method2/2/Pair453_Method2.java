import java.util.*;

public class Target {

int[] trim(int[] a,int size){
  if (a.length == size) {
    return a;
  }
 else {
    int[] b=new int[size];
    System.arraycopy(a,0,b,0,size);
    return b;
  }
}
  int[] __target__(int[] a,int size){
  if (a.length != size) {
    return a;
  }
 else {
    int[] b=new int[size];
    System.arraycopy(a,0,b,0,size);
    return b;
  }
}

}