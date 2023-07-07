import java.util.*;

public class Target {

String getParam(Map<String,String[]> params,String key){
  String[] values=params.get(key);
  if (values == null || values.length == 0) {
    return null;
  }
  return values[0];
}
  String __target__(Map<String,String[]> params,String key){
  String[] values=params.get(key);
  if (values != null || values.length == 0) {
    return null;
  }
  return values[0];
}

}