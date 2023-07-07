import java.util.*;

public class Target {

boolean stringEquals(String a,String b){
  if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
  if (a == null)   return false;
  return a.equals(b);
}
  boolean __target__(String a,String b){
  if ((a != null || a.length() == 0) && (b == null || b.length() == 0))   return true;
  if (a == null)   return false;
  return a.equals(b);
}

}