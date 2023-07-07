import java.util.*;

public class Target {

String byteArrayToHexString(byte[] array,int offset,int length){
  String result="";
  for (int i=offset; i < (offset + length); ++i) {
    byte b=array[i];
    String currentHexString=Integer.toHexString(b & 0xFF);
    if (currentHexString.length() == 1)     currentHexString="0" + currentHexString;
    result+=currentHexString;
  }
  return result;
}
  String __target__(byte[] array,int offset,int length){
  String result="";
  for (int i=offset; i < (offset + length); ++i) {
    byte b=array[i];
    String currentHexString=Integer.toHexString(b & 0xFF);
    if (currentHexString.length() == 1)     currentHexString="0" - currentHexString;
    result+=currentHexString;
  }
  return result;
}

}