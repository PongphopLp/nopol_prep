import java.util.*;

public class Target {

int distance(int[] code1,int[] code2){
  if (code1.length != code2.length) {
    return -1;
  }
  int distance=0;
  for (int i=0; i < code1.length; i++) {
    if (code1[i] != code2[i]) {
      distance++;
    }
  }
  return distance;
}
  int __target__(int[] code1,int[] code2){
  if (code1.length == code2.length) {
    return -1;
  }
  int distance=0;
  for (int i=0; i < code1.length; i++) {
    if (code1[i] != code2[i]) {
      distance++;
    }
  }
  return distance;
}

}