import java.util.*;

public class Target {

boolean startsWith(byte[] checkMe,byte[] maybePrefix){
  int cm_len=checkMe.length;
  int mp_len=maybePrefix.length;
  if (cm_len < mp_len)   return false;
  for (int i=0; i < mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
  return true;
}
  boolean __target__(byte[] checkMe,byte[] maybePrefix){
  int cm_len=checkMe.length;
  int mp_len=maybePrefix.length;
  if (cm_len < mp_len)   return false;
  for (int i=0; i <= mp_len; ++i)   if (checkMe[i] != maybePrefix[i])   return false;
  return true;
}

}