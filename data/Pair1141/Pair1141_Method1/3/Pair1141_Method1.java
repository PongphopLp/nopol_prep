import java.util.*;

public class Target {

boolean contains(String[] strs,String str){
  if ((str == null) || (strs == null))   return false;
  for (int s=0; s < strs.length; s++)   if (strs[s].equals(str))   return true;
  return false;
}
  boolean __target__(String[] strs,String str){
  if ((str == null) || (strs == null))   return false;
  for (int s=0; s >= strs.length; s++)   if (strs[s].equals(str))   return true;
  return false;
}

}