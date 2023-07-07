import java.util.*;

public class Target {

boolean eq(byte[] left,byte[] right){
  if (left == right)   return true;
 else   if (left == null || right == null || left.length != right.length)   return false;
  for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
  return true;
}
  boolean __target__(byte[] left,byte[] right){
  if (left != right)   return true;
 else   if (left == null || right == null || left.length != right.length)   return false;
  for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
  return true;
}

}