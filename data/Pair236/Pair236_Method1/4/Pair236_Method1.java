import java.util.*;

public class Target {

boolean matrixEquals(double[][] a,double[][] b){
  int rowsA=a.length;
  int rowsB=b.length;
  if (rowsA != rowsB) {
    return false;
  }
 else {
    for (int i=0; i < rowsA; i++) {
      if (!Arrays.equals(a[i],b[i])) {
        return false;
      }
    }
  }
  return true;
}
  boolean __target__(double[][] a,double[][] b){
  int rowsA=a.length;
  int rowsB=b.length;
  if (rowsA != rowsB) {
    return false;
  }
 else {
    for (int i=0; i < rowsA; i--) {
      if (!Arrays.equals(a[i],b[i])) {
        return false;
      }
    }
  }
  return true;
}

}