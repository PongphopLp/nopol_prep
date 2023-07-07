import java.util.*;

public class Target {

short max(short[] a){
  short res=a[0];
  short buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff > res) {
      res=buff;
    }
  }
  return res;
}
  short __target__(short[] a){
  short res=a[0];
  short buff;
  for (int i=1; i < a.length; i++) {
    buff=a[i];
    if (buff <= res) {
      res=buff;
    }
  }
  return res;
}

}