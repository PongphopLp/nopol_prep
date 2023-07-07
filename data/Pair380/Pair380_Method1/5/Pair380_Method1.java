import java.util.*;

public class Target {

double max(double[] a){
  double res=a[0];
  double buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}
  double __target__(double[] a){
  double res=a[0];
  double buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff >= res) {
      res=buff;
    }
  }
  return res;
}

}