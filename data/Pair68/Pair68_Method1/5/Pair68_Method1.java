import java.util.*;

public class Target {

boolean equals(byte[] b1,byte[] b2){
  boolean result=false;
  if (b1 == null && b2 == null)   return true;
  if (b1 != null && b2 != null) {
    result=b1.length == b2.length;
    if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
  }
  return result;
}
  boolean __target__(byte[] b1,byte[] b2){
  boolean result=false;
  if (b1 == null && b2 == null)   return true;
  if (b1 != null && b2 == null) {
    result=b1.length == b2.length;
    if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
  }
  return result;
}

}