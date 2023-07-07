import java.util.*;

public class Target {

boolean equalArrays(String[] one,String[] two){
  if ((one == null) && (two == null))   return true;
  if ((one == null) || (two == null))   return false;
  if (one.length != two.length)   return false;
  for (int i=0; i < one.length; i++) {
    if (!one[i].equals(two[i]))     return false;
  }
  return true;
}
  boolean __target__(String[] one,String[] two){
  if ((one == null) && (two != null))   return true;
  if ((one == null) || (two == null))   return false;
  if (one.length != two.length)   return false;
  for (int i=0; i < one.length; i++) {
    if (!one[i].equals(two[i]))     return false;
  }
  return true;
}

}