import java.util.*;

public class Target {

byte[] copyByteArray(byte[] array,int offset,int length){
  if (offset < 0 || length < 1 || offset > array.length || offset + length > array.length)   return null;
  byte[] result=new byte[length];
  System.arraycopy(array,offset,result,0,length);
  return result;
}
  byte[] __target__(byte[] array,int offset,int length){
  if (offset < 0 || length < 1 || offset >= array.length || offset + length > array.length)   return null;
  byte[] result=new byte[length];
  System.arraycopy(array,offset,result,0,length);
  return result;
}

}