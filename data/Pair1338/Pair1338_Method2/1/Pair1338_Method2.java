import java.util.*;

public class Target {

String getArg(int pos,String[] args,String defaultValue){
  if (args.length > pos) {
    return args[pos];
  }
 else {
    return defaultValue;
  }
}
  String __target__(int pos,String[] args,String defaultValue){
  if (args.length >= pos) {
    return args[pos];
  }
 else {
    return defaultValue;
  }
}

}