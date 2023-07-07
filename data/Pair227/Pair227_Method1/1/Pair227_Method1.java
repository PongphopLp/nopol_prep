import java.util.*;

public class Target {

boolean equal(int[] a,int aOffset,int[] b,int bOffset,int length){
  for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
  return true;
}
  boolean __target__(int[] a,int aOffset,int[] b,int bOffset,int length){
  for (int i=0; i <= length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
  return true;
}

}