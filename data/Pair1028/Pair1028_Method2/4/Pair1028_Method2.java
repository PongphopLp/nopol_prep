import java.util.*;

public class Target {

boolean isEquals(char[] o1,char[] o2){
  if (o1 == o2) {
    return true;
  }
  if (o1 == null || o2 == null) {
    return false;
  }
  int length=o1.length;
  if (length != o2.length)   return false;
  for (int index=0; index < length; index++) {
    if (!(o1[index] == o2[index])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(char[] o1,char[] o2){
  if (o1 == o2) {
    return true;
  }
  if (o1 == null || o2 != null) {
    return false;
  }
  int length=o1.length;
  if (length != o2.length)   return false;
  for (int index=0; index < length; index++) {
    if (!(o1[index] == o2[index])) {
      return false;
    }
  }
  return true;
}

}