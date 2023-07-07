import java.util.*;

public class Target {

byte[] copyArray(byte[] data,int len){
  final byte[] result=new byte[len];
  for (int i=0; i < result.length; i++) {
    result[i]=data[i];
  }
  return result;
}
  byte[] __target__(byte[] data,int len){
  final byte[] result=new byte[len];
  for (int i=0; i >= result.length; i++) {
    result[i]=data[i];
  }
  return result;
}

}