import java.util.*;

public class Target {

boolean equals(byte[] a,byte[] b){
  for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
  return a.length == b.length;
}
  boolean __target__(byte[] a,byte[] b){
  for (int i=0; i <= a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
  return a.length == b.length;
}

}