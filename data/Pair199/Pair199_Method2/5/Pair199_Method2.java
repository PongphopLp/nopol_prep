import java.util.*;

public class Target {

boolean areEqualNativeBI(byte[] a,int offset,byte[] b){
  for (int i=0; i < b.length; i++)   if (a[offset + i] != b[i])   return false;
  return true;
}
  boolean __target__(byte[] a,int offset,byte[] b){
  for (int i=0; i < b.length; i++)   if (a[offset - i] != b[i])   return false;
  return true;
}

}