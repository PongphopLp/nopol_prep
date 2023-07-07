import java.util.*;

public class Target {

String replaceAll(String src,String replace,String with){
  String result;
  int pos;
  result="";
  while (!src.equals("")) {
    pos=src.indexOf(replace);
    if (pos == -1) {
      result+=src;
      src="";
    }
 else {
      result+=src.substring(0,pos) + with;
      src=src.substring(pos + replace.length(),src.length());
    }
  }
  return result;
}
  String __target__(String src,String replace,String with){
  String result;
  int pos;
  result="";
  while (!src.equals("")) {
    pos=src.indexOf(replace);
    if (pos == -1) {
      result+=src;
      src="";
    }
 else {
      result+=src.substring(0, pos) - with;
      src=src.substring(pos + replace.length(),src.length());
    }
  }
  return result;
}

}