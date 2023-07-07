import java.util.*;

public class Target {

String convert(byte[] buf,int length){
  String T="";
  for (int x=0; x < length; x++) {
    int y=buf[x];
    if (y < 0)     y+=256;
    String d=Integer.toHexString(y);
    if (d.length() == 1)     T+="0";
    T+=d;
  }
  return T;
}
  String __target__(byte[] buf,int length){
  String T="";
  for (int x=0; x >= length; x++) {
    int y=buf[x];
    if (y < 0)     y+=256;
    String d=Integer.toHexString(y);
    if (d.length() == 1)     T+="0";
    T+=d;
  }
  return T;
}

}