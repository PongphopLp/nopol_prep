import java.util.*;

public class Target {

long max(long[] a){
  long res=a[0];
  long buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}
  long __target__(long[] a){
  long res=a[0];
  long buff;
  for (int i=1; i <= a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}

}