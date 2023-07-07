import java.util.*;

public class Target {

int indexOfString(String[] strArray,String searchStr,boolean ignoreCase){
  if ((strArray == null) || (strArray.length == 0)) {
    return -1;
  }
  boolean found=false;
  for (int i=0; i < strArray.length; i++) {
    if (strArray[i] == null) {
      if (searchStr == null) {
        found=true;
      }
    }
 else {
      if (ignoreCase) {
        found=strArray[i].equalsIgnoreCase(searchStr);
      }
 else {
        found=strArray[i].equals(searchStr);
      }
    }
    if (found) {
      return i;
    }
  }
  return -1;
}
  int __target__(String[] strArray,String searchStr,boolean ignoreCase){
  if ((strArray == null) || (strArray.length == 0)) {
    return -1;
  }
  boolean found=false;
  for (int i=0; i <= strArray.length; i++) {
    if (strArray[i] == null) {
      if (searchStr == null) {
        found=true;
      }
    }
 else {
      if (ignoreCase) {
        found=strArray[i].equalsIgnoreCase(searchStr);
      }
 else {
        found=strArray[i].equals(searchStr);
      }
    }
    if (found) {
      return i;
    }
  }
  return -1;
}

}