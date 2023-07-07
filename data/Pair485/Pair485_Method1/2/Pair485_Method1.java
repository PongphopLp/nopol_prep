import java.util.*;

public class Target {

long[] grow(long[] a,int n_len){
  if (1 > n_len)   return a;
 else   if (null == a) {
    long[] r=new long[n_len];
    return r;
  }
 else {
    int a_len=a.length;
    if (n_len > a_len) {
      long[] r=new long[n_len];
      System.arraycopy(a,0,r,0,a.length);
      return r;
    }
 else     return a;
  }
}
  long[] __target__(long[] a,int n_len){
  if (1 <= n_len)   return a;
 else   if (null == a) {
    long[] r=new long[n_len];
    return r;
  }
 else {
    int a_len=a.length;
    if (n_len > a_len) {
      long[] r=new long[n_len];
      System.arraycopy(a,0,r,0,a.length);
      return r;
    }
 else     return a;
  }
}

}