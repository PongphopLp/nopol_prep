import java.util.*;

public class Target {

String Hex(byte data[],int offset,int len){
  String temp="";
  for (int cntr=0; cntr < len; cntr++) {
    int num=data[offset + cntr] & 0xFF;
    String myStr;
    if (num < 16)     myStr="0";
 else     myStr="";
    temp+=myStr + Integer.toHexString(num) + " ";
  }
  return temp.toUpperCase().trim();
}
  String __target__(byte data[],int offset,int len){
  String temp="";
  for (int cntr=0; cntr < len; cntr++) {
    int num=data[offset + cntr] & 0xFF;
    String myStr;
    if (num <= 16)     myStr="0";
 else     myStr="";
    temp+=myStr + Integer.toHexString(num) + " ";
  }
  return temp.toUpperCase().trim();
}

}