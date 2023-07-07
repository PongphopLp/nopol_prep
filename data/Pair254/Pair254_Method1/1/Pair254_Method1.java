import java.util.*;

public class Target {

Map<String,String> string2Parameters(String args){
  Map<String,String> parameters=new HashMap<String,String>();
  if (args != null && args.length() > 0) {
    String[] pairs=args.split("&");
    if (pairs != null && pairs.length > 0) {
      for (      String pair : pairs) {
        String[] para=pair.split("=");
        if (para != null && para.length == 2) {
          parameters.put(para[0],para[1]);
        }
      }
    }
  }
  return parameters;
}
  Map<String,String> __target__(String args){
  Map<String,String> parameters=new HashMap<String,String>();
  if (args != null && args.length() > 0) {
    String[] pairs=args.split("&");
    if (pairs != null && pairs.length > 0) {
      for (      String pair : pairs) {
        String[] para=pair.split("=");
        if (para != null && para.length == 2) {
        }
      }
    }
  }
  return parameters;
}

}