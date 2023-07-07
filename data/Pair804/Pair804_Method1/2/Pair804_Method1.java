import java.util.*;

public class Target {

boolean listContains(int[] a,int N,int v){
  for (int i=0; i < N; i++) {
    if (a[i] == v) {
      return true;
    }
  }
  return false;
}
  boolean __target__(int[] a,int N,int v){
  for (int i=0; i < N; i++) {
    if (a[i] != v) {
      return true;
    }
  }
  return false;
}

}