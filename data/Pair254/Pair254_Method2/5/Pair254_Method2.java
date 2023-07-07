import java.util.*;

public class Target {

Map<String,String> parseParam(String contentString){
  Map<String,String> params=new HashMap<String,String>();
  if (contentString == null || contentString.trim().equals("")) {
    return params;
  }
  String[] paramsArray=contentString.split("\\&");
  if (paramsArray != null) {
    for (    String param : paramsArray) {
      String[] keyValue=param.split("=");
      if (keyValue != null && keyValue.length == 2) {
        params.put(keyValue[0],keyValue[1]);
      }
    }
  }
  return params;
}
  Map<String,String> __target__(String contentString){
  Map<String,String> params=new HashMap<String,String>();
  if (contentString == null || contentString.trim().equals("")) {
    return params;
  }
  String[] paramsArray=contentString.split("\\&");
  if (paramsArray != null) {
    for (    String param : paramsArray) {
      String[] keyValue=param.split("=");
      if (keyValue != null && keyValue.length == 2) {
      }
    }
  }
  return params;
}

}