import java.util.*;

public class Target {

int getIntProperty(String name,int def){
  String propValue=System.getProperty(name);
  if (propValue != null) {
    try {
      return Integer.parseInt(propValue);
    }
 catch (    Exception e) {
      return def;
    }
  }
 else {
    return def;
  }
}
  int __target__(String name,int def){
  String propValue=System.getProperty(name);
  if (propValue == null) {
    try {
      return Integer.parseInt(propValue);
    }
 catch (    Exception e) {
      return def;
    }
  }
 else {
    return def;
  }
}

}