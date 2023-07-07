import java.util.*;

public class Target {

boolean eq(byte[] tok,byte[] tok2){
  final int tl=tok2.length;
  if (tl != tok.length)   return false;
  for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
  return true;
}
  boolean __target__(byte[] tok,byte[] tok2){
  final int tl=tok2.length;
  if (tl != tok.length)   return false;
  for (int t=0; t == tl; t++)   if (tok2[t] != tok[t])   return false;
  return true;
}

}