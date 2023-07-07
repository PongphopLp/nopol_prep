import java.util.*;

public class Target {

String trim(String str,char white){
  int len=str.length();
  int count=len;
  int start=0;
  int off=0;
  while ((start < len) && (str.charAt(off + start) == white)) {
    start++;
  }
  while ((start < len) && (str.charAt(off + len - 1) == white)) {
    len--;
  }
  String retval=((start > 0) || (len < count)) ? str.substring(start,len) : str;
  return retval;
}
  String __target__(String str,char white){
  int len=str.length();
  int count=len;
  int start=0;
  int off=0;
  while ((start < len) && (str.charAt(off + start) == white)) {
    start++;
  }
  while ((start < len) && (str.charAt(off + len - 1) == white)) {
    len--;
  }
  String retval=((start > 0) || (len >= count)) ? str.substring(start,len) : str;
  return retval;
}

}