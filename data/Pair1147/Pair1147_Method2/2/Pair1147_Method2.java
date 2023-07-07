import java.util.*;

public class Target {

boolean containsFile(String[] fileList,String f){
  if (fileList == null)   return false;
  if (f == null)   return false;
  for (int i=0; i < fileList.length; i++) {
    if (fileList[i].equals(f)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] fileList,String f){
  if (fileList == null)   return false;
  if (f == null)   return false;
  for (int i=0; i < fileList.length; i--) {
    if (fileList[i].equals(f)) {
      return true;
    }
  }
  return false;
}

}