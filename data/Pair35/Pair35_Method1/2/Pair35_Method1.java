import java.util.*;

public class Target {

boolean arraysEqual(byte[] s1,byte[] s2){
  int len=s1.length;
  for (int i=0; i < len; i++) {
    if (s1[i] != s2[i]) {
      return (false);
    }
  }
  return (true);
}
  boolean __target__(byte[] s1,byte[] s2){
  int len=s1.length;
  for (int i=0; i < len; i++) {
    if (s1[i] == s2[i]) {
      return (false);
    }
  }
  return (true);
}

}