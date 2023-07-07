import java.util.*;

public class Target {

boolean compare(String s1,String s2,boolean ignore){
  if (s1 == s2)   return true;
  if (s1 == null || s2 == null)   return false;
  if (ignore)   return s1.equalsIgnoreCase(s2);
 else   return s1.equals(s2);
}
  boolean __target__(String s1,String s2,boolean ignore){
  if (s1 == s2)   return true;
  if (s1 != null || s2 == null)   return false;
  if (ignore)   return s1.equalsIgnoreCase(s2);
 else   return s1.equals(s2);
}

}