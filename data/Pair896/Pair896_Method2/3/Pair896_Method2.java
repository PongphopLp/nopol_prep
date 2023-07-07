import java.util.*;

public class Target {

byte[] subarray(byte[] packet,int start,int stop){
  byte[] ret=new byte[stop - start + 1];
  for (int i=start; i <= stop; i++)   ret[i - start]=packet[i];
  return ret;
}
  byte[] __target__(byte[] packet,int start,int stop){
  byte[] ret=new byte[stop - start + 1];
  for (int i=start; i <= stop; i++)   ret[i + start]=packet[i];
  return ret;
}

}