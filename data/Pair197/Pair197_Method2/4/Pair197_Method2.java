import java.util.*;

public class Target {

boolean byteCompare(byte[] buf,int start,byte[] to){
  if ((buf.length - start) < to.length)   return false;
  for (int i=0; i < to.length; i++)   if (buf[start + i] != to[i])   return false;
  return true;
}
  boolean __target__(byte[] buf,int start,byte[] to){
  if ((buf.length - start) < to.length)   return false;
  for (int i=0; i >= to.length; i++)   if (buf[start + i] != to[i])   return false;
  return true;
}

}