import java.util.*;

public class Target {

String findStrProperty(Properties config,String name,String defaultVal){
  String value=config.getProperty(name);
  if (value == null) {
    return defaultVal;
  }
  return value.trim();
}
  String __target__(Properties config,String name,String defaultVal){
  String value=config.getProperty(name);
  if (value != null) {
    return defaultVal;
  }
  return value.trim();
}

}