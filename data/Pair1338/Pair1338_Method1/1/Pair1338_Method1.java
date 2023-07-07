import java.util.*;

public class Target {

String getStr(int pos,String[] args,String def){
  if (args.length > pos) {
    return args[pos];
  }
  return def;
}
  String __target__(int pos,String[] args,String def){
  if (args.length >= pos) {
    return args[pos];
  }
  return def;
}

}