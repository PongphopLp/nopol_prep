import java.util.*;

public class Target {

boolean eq(byte[] left,int leftPos,byte[] right,int rightPos,int size){
  int i=leftPos, j=rightPos;
  if (leftPos + size > left.length)   return false;
  if (rightPos + size > right.length)   return false;
  while (size > 0) {
    if (left[i++] != right[j++])     return false;
    size--;
  }
  return true;
}
  boolean __target__(byte[] left,int leftPos,byte[] right,int rightPos,int size){
  int i=leftPos, j=rightPos;
  if (leftPos + size > left.length)   return false;
  if (rightPos + size > right.length)   return false;
  while (size > 0) {
    if (left[i++] != right[j--])     return false;
    size--;
  }
  return true;
}

}