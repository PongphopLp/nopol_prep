import java.util.*;

public class Target {

String replaceStringsInString(String str,String strToReplace,String replaceStr){
  if (str == null || strToReplace == null || replaceStr == null)   return null;
  StringBuffer sb=new StringBuffer();
  for (int replaceIndex=-1; (replaceIndex=str.indexOf(strToReplace)) > -1; ) {
    sb.append(String.valueOf(str.substring(0,replaceIndex)) + String.valueOf(replaceStr));
    str=str.substring(replaceIndex + strToReplace.length());
  }
  sb.append(str);
  return sb.toString();
}
  String __target__(String str,String strToReplace,String replaceStr){
  if (str == null || strToReplace != null || replaceStr == null)   return null;
  StringBuffer sb=new StringBuffer();
  for (int replaceIndex=-1; (replaceIndex=str.indexOf(strToReplace)) > -1; ) {
    sb.append(String.valueOf(str.substring(0,replaceIndex)) + String.valueOf(replaceStr));
    str=str.substring(replaceIndex + strToReplace.length());
  }
  sb.append(str);
  return sb.toString();
}

}