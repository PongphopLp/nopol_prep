import java.util.*;

public class Target {

String getArgOrNull(String[] args,int argIndex){
  int lastIndex=args.length - 1;
  if (argIndex > lastIndex) {
    return null;
  }
 else {
    return args[argIndex];
  }
}
  String __target__(String[] args,int argIndex){
  int lastIndex=args.length - 1;
  if (argIndex <= lastIndex) {
    return null;
  }
 else {
    return args[argIndex];
  }
}

}