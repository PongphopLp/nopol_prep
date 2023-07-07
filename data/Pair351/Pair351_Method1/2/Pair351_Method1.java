import java.util.*;

public class Target {

boolean matches(String arg,String p){
  if (p.endsWith(" ")) {
    return arg.equals(p.substring(0,p.length() - 1)) || arg.startsWith(p);
  }
  if (p.endsWith("$")) {
    return arg.equals(p.substring(0,p.length() - 1));
  }
  return arg.startsWith(p);
}
  boolean __target__(String arg,String p){
  if (p.endsWith(" ")) {
    return arg.equals(p.substring(0,p.length() - 1)) || arg.startsWith(p);
  }
  if (p.endsWith("$")) {
    return arg.equals(p.substring(0,p.length() + 1));
  }
  return arg.startsWith(p);
}

}