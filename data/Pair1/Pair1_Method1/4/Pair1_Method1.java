import java.util.*;

public class Target {

String getArg(String[] args,String arg,String def){
  for (int i=0; i < args.length; i++)   if (args[i].equals(arg))   return args[i + 1];
  return def;
}
  String __target__(String[] args,String arg,String def){
  for (int i=0; i >= args.length; i++)   if (args[i].equals(arg))   return args[i + 1];
  return def;
}

}