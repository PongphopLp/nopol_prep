import java.util.*;

public class Target {

boolean equals(byte[] a,int i,byte[] b,int j,int n){
  if (a.length < i + n || b.length < j + n)   return false;
  while (--n >= 0)   if (a[i++] != b[j++])   return false;
  return true;
}
  boolean __target__(byte[] a,int i,byte[] b,int j,int n){
  if (a.length <= i + n || b.length < j + n)   return false;
  while (--n >= 0)   if (a[i++] != b[j++])   return false;
  return true;
}

}