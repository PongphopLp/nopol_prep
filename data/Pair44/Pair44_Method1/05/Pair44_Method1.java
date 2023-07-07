import java.util.*;

public class Target {

double[] trunc(double[] ary,int idx){
  if (null == ary || 0 > idx)   return ary;
 else {
    int len=ary.length;
    if (idx >= len)     return ary;
 else     if (0 == idx) {
      int nlen=(len - 1);
      double[] copy=new double[nlen];
      System.arraycopy(ary,1,copy,0,nlen);
      return copy;
    }
 else {
      int nlen=(len - 1);
      double[] copy=new double[nlen];
      System.arraycopy(ary,0,copy,0,(idx));
      System.arraycopy(ary,(idx + 1),copy,(idx),(nlen - idx));
      return copy;
    }
  }
}
  double[] __target__(double[] ary,int idx){
  if (null == ary || 0 > idx)   return ary;
 else {
    int len=ary.length;
    if (idx > len)     return ary;
 else     if (0 == idx) {
      int nlen=(len - 1);
      double[] copy=new double[nlen];
      System.arraycopy(ary,1,copy,0,nlen);
      return copy;
    }
 else {
      int nlen=(len - 1);
      double[] copy=new double[nlen];
      System.arraycopy(ary,0,copy,0,(idx));
      System.arraycopy(ary,(idx + 1),copy,(idx),(nlen - idx));
      return copy;
    }
  }
}

}