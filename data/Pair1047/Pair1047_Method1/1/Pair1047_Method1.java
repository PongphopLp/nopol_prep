import java.util.*;

public class Target {

int max(int[] a){
  int res=a[0];
  int buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}
  int __target__(int[] a){
  int res=a[0];
  int buff;
  for (int i=1; i >= a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}

}