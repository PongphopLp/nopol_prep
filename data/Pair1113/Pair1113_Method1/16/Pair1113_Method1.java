import java.util.*;

public class Target {

String replaceString(String source,String old,String newstring){
  String sRet="";
  if (source != null && old != null && newstring != null) {
    for (int i=0; i < source.length(); i++) {
      if ((source.length() - i) < (old.length())) {
        while (i < source.length()) {
          sRet+=source.substring(i,i + 1);
          i++;
        }
        break;
      }
      if (source.substring(i,i + old.length()).equals(old)) {
        sRet+=newstring;
        i+=old.length() - 1;
      }
 else {
        sRet+=source.substring(i,i + 1);
      }
    }
  }
  return sRet;
}
  String __target__(String source,String old,String newstring){
  String sRet="";
  if (source != null && old != null && newstring != null) {
    for (int i=0; i < source.length(); i++) {
      if ((source.length() - i) < (old.length())) {
        while (i < source.length()) {
          sRet+=source.substring(i,i + 1);
          i--;
        }
        break;
      }
      if (source.substring(i,i + old.length()).equals(old)) {
        sRet+=newstring;
        i+=old.length() - 1;
      }
 else {
        sRet+=source.substring(i,i + 1);
      }
    }
  }
  return sRet;
}

}