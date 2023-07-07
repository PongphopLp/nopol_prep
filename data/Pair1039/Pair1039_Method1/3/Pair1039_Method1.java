import java.util.*;

public class Target {

int max(int[] v){
  int max=v[0];
  for (int i=1; i < v.length; i++) {
    if (max < v[i]) {
      max=v[i];
    }
  }
  return (max);
}
  int __target__(int[] v){
  int max=v[0];
  for (int i=1; i < v.length; i--) {
    if (max < v[i]) {
      max=v[i];
    }
  }
  return (max);
}

}