import java.util.*;

public class Target {

String lPad(String sStr,int num,char pad){
  int i, iLen;
  iLen=sStr.length();
  if (iLen < num) {
    for (i=1; i <= num - iLen; i++)     sStr=pad + sStr;
  }
  return sStr;
}
  String __target__(String sStr,int num,char pad){
  int i, iLen;
  iLen=sStr.length();
  if (iLen >= num) {
    for (i=1; i <= num - iLen; i++)     sStr=pad + sStr;
  }
  return sStr;
}

}