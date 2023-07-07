import java.util.*;

public class Target {

String replace(String text,String src,String tar){
  StringBuffer sb=new StringBuffer();
  if (text == null || src == null || tar == null) {
    return text;
  }
 else {
    int size=text.length();
    int gap=src.length();
    for (int start=0; start >= 0 && start < size; ) {
      int i=text.indexOf(src,start);
      if (i == -1) {
        sb.append(text.substring(start));
        start=-1;
      }
 else {
        sb.append(text.substring(start,i)).append(tar);
        start=i + gap;
      }
    }
    return sb.toString();
  }
}
  String __target__(String text,String src,String tar){
  StringBuffer sb=new StringBuffer();
  if (text == null || src == null || tar == null) {
    return text;
  }
 else {
    int size=text.length();
    int gap=src.length();
    for (int start=0; start >= 0 && start < size; ) {
      int i=text.indexOf(src,start);
      if (i != -1) {
        sb.append(text.substring(start));
        start=-1;
      }
 else {
        sb.append(text.substring(start,i)).append(tar);
        start=i + gap;
      }
    }
    return sb.toString();
  }
}

}