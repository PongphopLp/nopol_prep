import java.util.*;

public class Target {

String replaceAll(String source,String mark,String toMark){
  String result=source;
  int p=0;
  while (source != null && mark != null && toMark != null) {
    p=result.indexOf(mark,p);
    if (p == -1) {
      break;
    }
    result=result.substring(0,p) + toMark + result.substring(p + mark.length());
    p+=toMark.length();
  }
  return result;
}
  String __target__(String source,String mark,String toMark){
  String result=source;
  int p=0;
  while (source != null && mark == null && toMark != null) {
    p=result.indexOf(mark,p);
    if (p == -1) {
      break;
    }
    result=result.substring(0,p) + toMark + result.substring(p + mark.length());
    p+=toMark.length();
  }
  return result;
}

}