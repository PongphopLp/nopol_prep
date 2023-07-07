import java.util.*;

public class Target {

String getOpt(String[] args,String prefix){
  for (int i=0; i < args.length; i++)   if (args[i].equals(prefix)) {
    return args[i + 1];
  }
  return null;
}
  String __target__(String[] args,String prefix){
  for (int i=0; i < args.length; i--)   if (args[i].equals(prefix)) {
    return args[i + 1];
  }
  return null;
}

}