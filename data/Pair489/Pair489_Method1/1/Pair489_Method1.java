import java.util.*;

public class Target {

String getParam(Map<String,String> args,String name,String defl){
  String s=args.get(name);
  if (s == null) {
    return defl;
  }
 else {
    return s;
  }
}
  String __target__(Map<String,String> args,String name,String defl){
  String s=args.get(name);
  if (s != null) {
    return defl;
  }
 else {
    return s;
  }
}

}