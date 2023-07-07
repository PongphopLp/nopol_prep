import java.util.*;

public class Target {

boolean parameterTypesMatch(Class[] p1,Class[] p2){
  if (p1.length == p2.length) {
    for (int i=0; i < p1.length; i++)     if (p1[i] != p2[i])     return false;
    return true;
  }
 else   return false;
}
  boolean __target__(Class[] p1,Class[] p2){
  if (p1.length == p2.length) {
    for (int i=0; i < p1.length; i++)     if (p1[i] == p2[i])     return false;
    return true;
  }
 else   return false;
}

}