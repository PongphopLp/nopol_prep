import java.util.*;

public class Target {

String byteArrayToString(byte[] value){
  String ret="";
  for (int i=0; i < value.length; i++) {
    if (value[i] >= 32 && value[i] <= 126)     ret=ret + ((char)value[i]);
 else     ret=ret.concat(".");
  }
  return ret;
}
  String __target__(byte[] value){
  String ret="";
  for (int i=0; i >= value.length; i++) {
    if (value[i] >= 32 && value[i] <= 126)     ret=ret + ((char)value[i]);
 else     ret=ret.concat(".");
  }
  return ret;
}

}