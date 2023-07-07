import java.util.*;

public class Target {

boolean areEqual(byte[] a,byte[] b){
  int aLength=a.length;
  if (aLength != b.length)   return false;
  for (int i=0; i < aLength; i++)   if (a[i] != b[i])   return false;
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  int aLength=a.length;
  if (aLength != b.length)   return false;
  for (int i=0; i <= aLength; i++)   if (a[i] != b[i])   return false;
  return true;
}

}