import java.util.*;

public class Target {

int indexOfMaximum(float[] vec){
  float prev=vec[0];
  int index=0;
  for (int i=1; i < vec.length; i++) {
    if (prev > vec[i]) {
      prev=vec[i];
      index=i;
    }
  }
  return index;
}
  int __target__(float[] vec){
  float prev=vec[0];
  int index=0;
  for (int i=1; i < vec.length; i++) {
    if (prev <= vec[i]) {
      prev=vec[i];
      index=i;
    }
  }
  return index;
}

}