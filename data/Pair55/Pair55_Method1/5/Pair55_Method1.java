import java.util.*;

public class Target {

boolean cmp(byte[] A,byte[] B){
  if (A == null)   return B == null;
 else   if (B == null || A.length != B.length)   return false;
 else   for (int i=0; i < A.length; i++) {
    if (A[i] != B[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] A,byte[] B){
  if (A == null)   return B == null;
 else   if (B == null || A.length == B.length)   return false;
 else   for (int i=0; i < A.length; i++) {
    if (A[i] != B[i])     return false;
  }
  return true;
}

}