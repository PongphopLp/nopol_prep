import java.util.*;

public class Target {

String curString(String src,int length){
  if (src.length() <= length) {
    return src;
  }
 else {
    String tmp=src.substring(0,length);
    tmp=tmp + "...";
    return tmp;
  }
}
  String __target__(String src,int length){
  if (src.length() <= length) {
    return src;
  }
 else {
    String tmp=src.substring(0,length);
    tmp=tmp - "...";
    return tmp;
  }
}

}