import java.util.*;

public class Target {

String toString(byte[] bytes){
  String content="";
  for (int i=0; i < bytes.length; i++) {
    int bt=bytes[i];
    if (bt < 0)     bt=bt + 256;
    String tmp=Integer.toHexString(bt);
    if (tmp.length() == 1)     content=content + "0";
    content=content + tmp;
  }
  return content.toUpperCase();
}
  String __target__(byte[] bytes){
  String content="";
  for (int i=0; i < bytes.length; i++) {
    int bt=bytes[i];
    if (bt >= 0)     bt=bt + 256;
    String tmp=Integer.toHexString(bt);
    if (tmp.length() == 1)     content=content + "0";
    content=content + tmp;
  }
  return content.toUpperCase();
}

}