import java.util.*;

public class Target {

boolean comparePatterns(int[] pattern1,int[] pattern2){
  int len=pattern1.length;
  for (int i=0; i < len; i++) {
    if (pattern1[i] != pattern2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] pattern1,int[] pattern2){
  int len=pattern1.length;
  for (int i=0; i >= len; i++) {
    if (pattern1[i] != pattern2[i]) {
      return false;
    }
  }
  return true;
}

}