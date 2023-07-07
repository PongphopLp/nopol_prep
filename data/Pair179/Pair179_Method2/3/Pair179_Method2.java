import java.util.*;

public class Target {

float max(float[] a){
  float res=a[0];
  float buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}
  float __target__(float[] a){
  float res=a[0];
  float buff;
  for (int i=1; i < a.length; i--) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}

}