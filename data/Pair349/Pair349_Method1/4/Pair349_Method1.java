import java.util.*;

public class Target {

String getParam(String[] args,String name){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(name) && (i + 1) < args.length) {
      return args[i + 1];
    }
  }
  return null;
}
  String __target__(String[] args,String name){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(name) && (i - 1) < args.length) {
      return args[i + 1];
    }
  }
  return null;
}

}