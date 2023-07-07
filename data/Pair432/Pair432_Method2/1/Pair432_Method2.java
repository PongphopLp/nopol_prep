import java.util.*;

public class Target {

String findStringProperty(Properties config,String name,String defaultVal){
  String value=config.getProperty(name);
  if (value == null) {
    value=defaultVal;
  }
  return value;
}
  String __target__(Properties config,String name,String defaultVal){
  String value=config.getProperty(name);
  if (value != null) {
    value=defaultVal;
  }
  return value;
}

}