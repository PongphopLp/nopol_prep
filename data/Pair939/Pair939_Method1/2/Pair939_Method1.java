import java.util.*;

public class Target {

boolean different(String str1,String str2){
  if (str1 == null)   return str2 != null;
  if (str2 == null)   return str1 != null;
  return !str1.equals(str2);
}
  boolean __target__(String str1,String str2){
  if (str1 == null)   return str2 == null;
  if (str2 == null)   return str1 != null;
  return !str1.equals(str2);
}

}