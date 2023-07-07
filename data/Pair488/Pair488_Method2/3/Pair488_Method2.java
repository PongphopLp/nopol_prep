import java.util.*;

public class Target {

boolean isEmpty(String str,boolean consider_trim){
  if (str == null)   return true;
 else   if (str.length() == 0)   return true;
 else   if (consider_trim && str.trim().length() == 0)   return true;
 else   return false;
}
  boolean __target__(String str,boolean consider_trim){
  if (str == null)   return true;
 else   if (str.length() == 0)   return true;
 else   if (consider_trim && str.trim().length() != 0)   return true;
 else   return false;
}

}