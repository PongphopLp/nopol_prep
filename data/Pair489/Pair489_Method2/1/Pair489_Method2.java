import java.util.*;

public class Target {

String getAuthInfoParam(Map<String,String> attrs,String name,String def){
  String val=attrs.get(name);
  if (val == null) {
    val=def;
  }
  return val;
}
  String __target__(Map<String,String> attrs,String name,String def){
  String val=attrs.get(name);
  if (val != null) {
    val=def;
  }
  return val;
}

}