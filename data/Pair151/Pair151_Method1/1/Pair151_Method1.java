import java.util.*;

public class Target {

boolean startsWith(byte[] tok,byte[] sub){
  final int sl=sub.length;
  if (sl > tok.length)   return false;
  for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
  return true;
}
  boolean __target__(byte[] tok,byte[] sub){
  final int sl=sub.length;
  if (sl >= tok.length)   return false;
  for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
  return true;
}

}