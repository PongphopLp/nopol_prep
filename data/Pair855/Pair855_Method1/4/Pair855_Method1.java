import java.util.*;

public class Target {

byte[] XORByteArrays(byte[] a,byte[] b){
  if (a == null || b == null)   return null;
  if (a.length != b.length)   return null;
  byte[] result=new byte[a.length];
  for (int i=0; i < result.length; i++)   result[i]=(byte)(a[i] ^ b[i]);
  return result;
}
  byte[] __target__(byte[] a,byte[] b){
  if (a != null || b == null)   return null;
  if (a.length != b.length)   return null;
  byte[] result=new byte[a.length];
  for (int i=0; i < result.length; i++)   result[i]=(byte)(a[i] ^ b[i]);
  return result;
}

}