import java.util.*;

public class Target {

String getString(byte[] data,int offset,int length){
  byte[] stringData=new byte[length];
  System.arraycopy(data,offset,stringData,0,length);
  char[] charArray=new char[length];
  for (int i=0; i < length; i++) {
    charArray[i]=(char)stringData[i];
  }
  return String.valueOf(charArray);
}
  String __target__(byte[] data,int offset,int length){
  byte[] stringData=new byte[length];
  System.arraycopy(data,offset,stringData,0,length);
  char[] charArray=new char[length];
  for (int i=0; i < length; i--) {
    charArray[i]=(char)stringData[i];
  }
  return String.valueOf(charArray);
}

}