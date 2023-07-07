import java.util.*;

public class Target {

boolean byteMatch(byte[] pat,byte[] in,int idx){
  if ((idx + pat.length) > in.length)   return false;
  for (int i=0; i < pat.length; i++)   if (pat[i] != in[i + idx])   return false;
 else   ;
  return true;
}
  boolean __target__(byte[] pat,byte[] in,int idx){
  if ((idx + pat.length) <= in.length)   return false;
  for (int i=0; i < pat.length; i++)   if (pat[i] != in[i + idx])   return false;
 else   ;
  return true;
}

}