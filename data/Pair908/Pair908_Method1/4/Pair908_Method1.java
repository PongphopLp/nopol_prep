import java.util.*;

public class Target {

byte[] Trim(byte[] in,int to){
  if (null == in)   return null;
 else   if (in.length <= to)   return in;
 else {
    byte[] copier=new byte[to];
    System.arraycopy(in,0,copier,0,to);
    return copier;
  }
}
  byte[] __target__(byte[] in,int to){
  if (null == in)   return null;
 else   if (in.length < to)   return in;
 else {
    byte[] copier=new byte[to];
    System.arraycopy(in,0,copier,0,to);
    return copier;
  }
}

}