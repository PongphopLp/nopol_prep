import java.util.*;

public class Target {

int maximum(int[] vec){
  if (vec.length != 0) {
    int max=vec[0];
    for (int i=0; i < vec.length; i++)     if (vec[i] > max)     max=vec[i];
    return max;
  }
  return 0;
}
  int __target__(int[] vec){
  if (vec.length != 0) {
    int max=vec[0];
    for (int i=0; i < vec.length; i++)     if (vec[i] >= max)     max=vec[i];
    return max;
  }
  return 0;
}

}