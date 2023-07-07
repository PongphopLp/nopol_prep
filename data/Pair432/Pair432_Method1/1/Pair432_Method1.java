import java.util.*;

public class Target {

String getOptionalProperty(Properties p,String prop_name,String def_value){
  String val=p.getProperty(prop_name);
  if (val == null) {
    return def_value;
  }
  return val;
}
  String __target__(Properties p,String prop_name,String def_value){
  String val=p.getProperty(prop_name);
  if (val != null) {
    return def_value;
  }
  return val;
}

}