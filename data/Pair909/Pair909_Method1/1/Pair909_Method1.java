import java.util.*;

public class Target {

byte[] subArray(byte[] message,int start,int count){
  byte[] result=new byte[count];
  int j=0;
  for (int i=start; i < start + count; i++)   result[j++]=message[i];
  return result;
}
  byte[] __target__(byte[] message,int start,int count){
  byte[] result=new byte[count];
  int j=0;
  for (int i=start; i < start - count; i++)   result[j++]=message[i];
  return result;
}

}