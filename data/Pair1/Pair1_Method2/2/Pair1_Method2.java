import java.util.*;

public class Target {

String findOptionalStringValue(String[] args,String name,String defaultValue){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(name)) {
      return args[i + 1];
    }
  }
  return defaultValue;
}
  String __target__(String[] args,String name,String defaultValue){
  for (int i=0; i <= args.length; i++) {
    if (args[i].equals(name)) {
      return args[i + 1];
    }
  }
  return defaultValue;
}

}