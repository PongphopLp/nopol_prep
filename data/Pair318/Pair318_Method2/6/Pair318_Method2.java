import java.util.*;

public class Target {

boolean StringArrayEquals(String[] str1,String[] str2){
  if (str1 == null || str2 == null)   return false;
  if (str1.length != str2.length)   return false;
  for (int i=0; i < str1.length; i++) {
    if (!str1[i].equals(str2[i]))     return false;
  }
  return true;
}
  boolean __target__(String[] str1,String[] str2){
  if (str1 == null || str2 == null)   return false;
  if (str1.length != str2.length)   return false;
  for (int i=0; i >= str1.length; i++) {
    if (!str1[i].equals(str2[i]))     return false;
  }
  return true;
}

}