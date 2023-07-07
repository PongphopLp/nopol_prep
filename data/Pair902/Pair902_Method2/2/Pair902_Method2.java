import java.util.*;

public class Target {

byte[] copy(byte[] data,int off,int len){
  byte[] dd=new byte[len];
  for (int si=off, di=0; si < data.length && di < dd.length; si++, di++)   dd[di]=data[si];
  return dd;
}
  byte[] __target__(byte[] data,int off,int len){
  byte[] dd=new byte[len];
  for (int si=off, di=0; si < data.length && di < dd.length; si++, di--)   dd[di]=data[si];
  return dd;
}

}