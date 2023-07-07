import java.util.*;

public class Target {

String duplicateString(String str,int iCount){
  if (iCount == 0 || str.length() == 0) {
    return "";
  }
  StringBuffer sb=new StringBuffer(str.length() * iCount);
  for (int i=iCount; i > 0; i--) {
    sb.append(str);
  }
  return sb.toString();
}
  String __target__(String str,int iCount){
  if (iCount != 0 || str.length() == 0) {
    return "";
  }
  StringBuffer sb=new StringBuffer(str.length() * iCount);
  for (int i=iCount; i > 0; i--) {
    sb.append(str);
  }
  return sb.toString();
}

}