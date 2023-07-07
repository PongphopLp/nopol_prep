import java.util.*;

public class Target {

int minimum(int[] vec){
  if (vec.length != 0) {
    int min=vec[0];
    for (int i=0; i < vec.length; i++)     if (vec[i] < min)     min=vec[i];
    return min;
  }
  return 0;
}
  int __target__(int[] vec){
  if (vec.length != 0) {
    int min=vec[0];
    for (int i=0; i < vec.length; i++)     if (vec[i] <= min)     min=vec[i];
    return min;
  }
  return 0;
}

}