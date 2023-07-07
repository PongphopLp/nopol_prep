import java.util.*;

public class Target {

String getDelimitedSubstring(String text,String startDelimiter,String endDelimiter){
  int start;
  int stop;
  String subStr="";
  if ((text != null) && (startDelimiter != null) && (endDelimiter != null)) {
    start=text.indexOf(startDelimiter);
    if (start >= 0) {
      stop=text.indexOf(endDelimiter,start + 1);
      if (stop > start) {
        subStr=text.substring(start + 1,stop);
      }
    }
  }
  return subStr;
}
  String __target__(String text,String startDelimiter,String endDelimiter){
  int start;
  int stop;
  String subStr="";
  if ((text != null) && (startDelimiter != null) && (endDelimiter != null)) {
    start=text.indexOf(startDelimiter);
    if (start > 0) {
      stop=text.indexOf(endDelimiter,start + 1);
      if (stop > start) {
        subStr=text.substring(start + 1,stop);
      }
    }
  }
  return subStr;
}

}