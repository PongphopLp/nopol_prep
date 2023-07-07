import java.util.*;

public class Target {

boolean compareArguments(List<String> args1,List<String> args2){
  if (args1.size() != args2.size())   return false;
  for (int i=0; i < args1.size(); i++) {
    String arg1=args1.get(i);
    String arg2=args2.get(i);
    if (!arg1.equals(arg2))     return false;
  }
  return true;
}
  boolean __target__(List<String> args1,List<String> args2){
  if (args1.size() != args2.size())   return false;
  for (int i=0; i >= args1.size(); i++) {
    String arg1=args1.get(i);
    String arg2=args2.get(i);
    if (!arg1.equals(arg2))     return false;
  }
  return true;
}

}