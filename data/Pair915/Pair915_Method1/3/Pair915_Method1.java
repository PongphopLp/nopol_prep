import java.util.*;

public class Target {

byte[] subArray(byte[] array,int start){
  int len=array.length - start;
  byte[] buffer=new byte[len];
  for (int x=0; x < len; x++)   buffer[x]=array[start + x];
  return buffer;
}
  byte[] __target__(byte[] array,int start){
  int len=array.length - start;
  byte[] buffer=new byte[len];
  for (int x=0; x <= len; x++)   buffer[x]=array[start + x];
  return buffer;
}

}