import java.util.*;

public class Target {

boolean changed(String v1,String v2){
  if (v1 == null && v2 == null)   return false;
  if (v1 == null || v2 == null)   return true;
  return !v1.equals(v2);
}
  boolean __target__(String v1,String v2){
  if (v1 == null && v2 == null)   return false;
  if (v1 != null || v2 == null)   return true;
  return !v1.equals(v2);
}

}