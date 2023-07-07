import java.util.*;

public class Target {

boolean arrayRegionMatches(int[] source,int sourceStart,int[] target,int targetStart,int len){
  int sourceEnd=sourceStart + len;
  int delta=targetStart - sourceStart;
  for (int i=sourceStart; i < sourceEnd; i++) {
    if (source[i] != target[i + delta])     return false;
  }
  return true;
}
  boolean __target__(int[] source,int sourceStart,int[] target,int targetStart,int len){
  int sourceEnd=sourceStart + len;
  int delta=targetStart - sourceStart;
  for (int i=sourceStart; i < sourceEnd; i++) {
    if (source[i] != target[i - delta])     return false;
  }
  return true;
}

}