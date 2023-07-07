import java.util.*;

public class Target {

byte[] extractBytes(byte[] data,int offset,int length){
  byte[] copiedBytes=new byte[length];
  for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset + i];
  return copiedBytes;
}
  byte[] __target__(byte[] data,int offset,int length){
  byte[] copiedBytes=new byte[length];
  for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset - i];
  return copiedBytes;
}

}