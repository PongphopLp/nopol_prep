import java.util.*;

public class Target {

boolean isDifferent(String a,String b){
  if (a == null && b == null)   return false;
  if (a == null)   return true;
  if (b == null)   return true;
  return (a.compareTo(b) != 0);
}
  boolean __target__(String a,String b){
  if (a == null && b == null)   return false;
  if (a != null)   return true;
  if (b == null)   return true;
  return (a.compareTo(b) != 0);
}

}