import java.util.*;

public class Target {

String getParam(String[] args,String arg){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(arg) && i < args.length - 1) {
      return args[i + 1];
    }
  }
  return null;
}
  String __target__(String[] args,String arg){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(arg) && i <= args.length - 1) {
      return args[i + 1];
    }
  }
  return null;
}

}