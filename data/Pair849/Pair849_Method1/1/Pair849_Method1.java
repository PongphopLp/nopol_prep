import java.util.*;

public class Target {

String getString(Hashtable hints,String key,String def){
  String val=(String)hints.get(key);
  if (val == null) {
    val=def;
  }
  return val;
}
  String __target__(Hashtable hints,String key,String def){
  String val=(String)hints.get(key);
  if (val != null) {
    val=def;
  }
  return val;
}

}