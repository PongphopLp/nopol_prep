import java.util.*;

public class Target {

int min(int[] v){
  int min=v[0];
  for (int i=1; i < v.length; i++) {
    if (min > v[i]) {
      min=v[i];
    }
  }
  return (min);
}
  int __target__(int[] v){
  int min=v[0];
  for (int i=1; i >= v.length; i++) {
    if (min > v[i]) {
      min=v[i];
    }
  }
  return (min);
}

}