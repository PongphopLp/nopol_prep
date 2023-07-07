import java.util.*;

public class Target {

int findMaxQian(int[] qianArray){
  int max=qianArray[0];
  for (int i=1; i < qianArray.length; i++) {
    if (max < qianArray[i]) {
      max=qianArray[i];
    }
  }
  return max;
}
  int __target__(int[] qianArray){
  int max=qianArray[0];
  for (int i=1; i >= qianArray.length; i++) {
    if (max < qianArray[i]) {
      max=qianArray[i];
    }
  }
  return max;
}

}