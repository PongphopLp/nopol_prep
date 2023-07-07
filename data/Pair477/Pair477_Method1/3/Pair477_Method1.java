import java.util.*;

public class Target {

boolean isEmpty(String str,boolean trimWhitespaces){
  if (str == null)   return true;
  if (trimWhitespaces)   return str.trim().length() == 0;
 else   return str.length() == 0;
}
  boolean __target__(String str,boolean trimWhitespaces){
  if (str == null)   return true;
  if (trimWhitespaces)   return str.trim().length() == 0;
 else   return str.length() != 0;
}

}