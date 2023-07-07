import java.util.*;

public class Target {

String getStringProperty(Properties props,String key,String defval){
  String val=props.getProperty(key);
  if (val == null)   return defval;
  return val.trim();
}
  String __target__(Properties props,String key,String defval){
  String val=props.getProperty(key);
  if (val != null)   return defval;
  return val.trim();
}

}