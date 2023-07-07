import java.util.*;

public class Target {

boolean byteArrayEqual(byte[] a,byte[] b,int offset,int length){
  int lim=offset + length;
  if (a.length < lim || b.length < lim)   return false;
  for (int i=offset; i < lim; ++i)   if (a[i] != b[i])   return false;
  return true;
}
  boolean __target__(byte[] a,byte[] b,int offset,int length){
  int lim=offset + length;
  if (a.length <= lim || b.length < lim)   return false;
  for (int i=offset; i < lim; ++i)   if (a[i] != b[i])   return false;
  return true;
}

}