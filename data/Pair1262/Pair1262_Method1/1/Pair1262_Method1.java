import java.util.*;

public class Target {

boolean nonZeroArray(byte[] data,int offset,int len){
  for (int c=offset; c < len + offset; c++)   if (data[c] != 0)   return true;
  return false;
}
  boolean __target__(byte[] data,int offset,int len){
  for (int c=offset; c <= len + offset; c++)   if (data[c] != 0)   return true;
  return false;
}

}