import java.util.*;

public class Target {

boolean contains(String str,String segment){
  if ((str == null) || (segment == null))   return false;
  if (segment.length() == 0)   return true;
  return str.indexOf(segment) >= 0;
}
  boolean __target__(String str,String segment){
  if ((str == null) || (segment != null))   return false;
  if (segment.length() == 0)   return true;
  return str.indexOf(segment) >= 0;
}

}