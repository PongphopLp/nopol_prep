import java.util.*;

public class Target {

boolean compareByte(int[] a,int[] b){
  if (a.length != b.length)   return false;
  for (int i=0, bound=a.length; i < bound; i++)   if (a[i] != b[i])   return false;
  return true;
}
  boolean __target__(int[] a,int[] b){
  if (a.length != b.length)   return false;
  for (int i=0, bound=a.length; i < bound; i++)   if (a[i] == b[i])   return false;
  return true;
}

}