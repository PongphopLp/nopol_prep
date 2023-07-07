import java.util.*;

public class Target {

boolean _part3Compare(byte[] a,byte[] b){
  for (int i=0; i < 16; i++)   if (a[i] != b[i + 4])   return false;
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  for (int i=0; i <= 16; i++)   if (a[i] != b[i + 4])   return false;
  return true;
}

}