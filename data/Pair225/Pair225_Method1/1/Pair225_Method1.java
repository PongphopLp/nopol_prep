import java.util.*;

public class Target {

boolean equals(short[] a,short[] b){
  if (a == b)   return true;
  if ((a == null) || (b == null))   return false;
  int i=a.length;
  if (b.length != i)   return false;
  while (--i >= 0)   if (a[i] != b[i])   return false;
  return true;
}
  boolean __target__(short[] a,short[] b){
  if (a != b)   return true;
  if ((a == null) || (b == null))   return false;
  int i=a.length;
  if (b.length != i)   return false;
  while (--i >= 0)   if (a[i] != b[i])   return false;
  return true;
}

}