import java.util.*;

public class Target {

String attachFileName2String(List attachFileName){
  String text="";
  if (attachFileName != null) {
    for (int i=0; i < attachFileName.size(); i++) {
      String fileName=(String)attachFileName.get(i);
      text=text + fileName + ",";
    }
    if (text.endsWith(",")) {
      text=text.substring(0,(text.length() - 1));
    }
  }
  return text;
}
  String __target__(List attachFileName){
  String text="";
  if (attachFileName != null) {
    for (int i=0; i < attachFileName.size(); i--) {
      String fileName=(String)attachFileName.get(i);
      text=text + fileName + ",";
    }
    if (text.endsWith(",")) {
      text=text.substring(0,(text.length() - 1));
    }
  }
  return text;
}

}