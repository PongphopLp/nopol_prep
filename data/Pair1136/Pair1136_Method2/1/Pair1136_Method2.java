import java.util.*;

public class Target {

boolean compareBoundary(String boundary,byte ba[]){
  if (boundary == null || ba == null)   return false;
  for (int i=0; i < boundary.length(); i++)   if ((byte)boundary.charAt(i) != ba[i])   return false;
  return true;
}
  boolean __target__(String boundary,byte ba[]){
  if (boundary != null || ba == null)   return false;
  for (int i=0; i < boundary.length(); i++)   if ((byte)boundary.charAt(i) != ba[i])   return false;
  return true;
}

}