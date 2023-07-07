import java.util.*;

public class Target {

boolean getBoolean(String b,boolean defval){
  if (b == null)   return defval;
  String upperB=b.toUpperCase();
  if ("1".equals(b))   return (true);
  if ("0".equals(b))   return (false);
  if ("TRUE".equals(upperB))   return (true);
  if ("FALSE".equals(upperB))   return (false);
  return defval;
}
  boolean __target__(String b,boolean defval){
  if (b != null)   return defval;
  String upperB=b.toUpperCase();
  if ("1".equals(b))   return (true);
  if ("0".equals(b))   return (false);
  if ("TRUE".equals(upperB))   return (true);
  if ("FALSE".equals(upperB))   return (false);
  return defval;
}

}