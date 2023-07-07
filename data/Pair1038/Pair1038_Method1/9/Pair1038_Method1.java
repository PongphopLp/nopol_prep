import java.util.*;

public class Target {

boolean charArraysEqual(char[] c1,char[] c2){
  if (c1 == null)   return (c2 == null);
 else   if (c2 == null)   return (c1 == null);
  if (c1.length != c2.length)   return false;
  for (int i=0; i < c1.length; i++) {
    if (c1[i] != c2[i])     return false;
  }
  return true;
}
  boolean __target__(char[] c1,char[] c2){
  if (c1 == null)   return (c2 == null);
 else   if (c2 == null)   return (c1 == null);
  if (c1.length != c2.length)   return false;
  for (int i=0; i <= c1.length; i++) {
    if (c1[i] != c2[i])     return false;
  }
  return true;
}

}