import java.util.*;

public class Target {

boolean isChecksumEqual(byte[] cksum1,byte[] cksum2){
  if (cksum1 == cksum2)   return true;
  if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
  if (cksum1.length != cksum2.length)   return false;
  for (int i=0; i < cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
  return true;
}
  boolean __target__(byte[] cksum1,byte[] cksum2){
  if (cksum1 == cksum2)   return true;
  if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
  if (cksum1.length != cksum2.length)   return false;
  for (int i=0; i <= cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
  return true;
}

}