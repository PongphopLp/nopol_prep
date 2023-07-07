import java.util.*;

public class Target {

byte[] removePrefix(byte[] array,int prefixLength){
  int newLength=array.length - prefixLength;
  byte[] newArray=new byte[newLength];
  if (newLength == 0)   return newArray;
  System.arraycopy(array,prefixLength,newArray,0,newLength);
  return newArray;
}
  byte[] __target__(byte[] array,int prefixLength){
  int newLength=array.length - prefixLength;
  byte[] newArray=new byte[newLength];
  if (newLength == 0)   return newArray;
  return newArray;
}

}