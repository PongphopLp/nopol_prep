import java.util.*;

public class Target {

boolean eval(String str1,String str2){
  if ((str1 == null) && (str2 == null))   return false;
  if (str1 == null)   return true;
  if (str2 == null)   return true;
  return !str1.equals(str2);
}
  boolean __target__(String str1,String str2){
  if ((str1 == null) && (str2 == null))   return false;
  if (str1 == null)   return true;
  if (str2 != null)   return true;
  return !str1.equals(str2);
}

}