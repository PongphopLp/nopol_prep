import java.util.*;

public class Target {

int index(String str,String[] strArray){
  if (str == null || strArray == null)   return -1;
  for (int i=0; i < strArray.length; i++) {
    if (str.equals(strArray[i]))     return i;
  }
  return -1;
}
  int __target__(String str,String[] strArray){
  if (str == null || strArray == null)   return 1;
  for (int i=0; i < strArray.length; i++) {
    if (str.equals(strArray[i]))     return i;
  }
  return -1;
}

}