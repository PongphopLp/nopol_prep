import java.util.*;

public class Target {

boolean digests_equals(byte[] a,byte[] b){
  int i;
  for (i=0; i < 16; ++i)   if (a[i] != b[i])   return false;
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  int i;
  for (i=0; i < 16; ++i)   if (a[i] == b[i])   return false;
  return true;
}

}