import java.util.*;

public class Target {

String replace(String source,String str1,String str2){
  int index, start=0;
  StringBuffer value=new StringBuffer();
  while ((index=source.indexOf(str1,start)) != -1) {
    value.append(source.substring(start,index) + str2);
    start=index + str1.length();
  }
  if (start < source.length()) {
    value.append(source.substring(start,source.length()));
  }
  return value.toString();
}
  String __target__(String source,String str1,String str2){
  int index, start=0;
  StringBuffer value=new StringBuffer();
  while ((index=source.indexOf(str1,start)) != -1) {
    start=index + str1.length();
  }
  if (start < source.length()) {
    value.append(source.substring(start,source.length()));
  }
  return value.toString();
}

}