import java.util.*;

public class Target {

String toPrefixedPascalCase(String prefix,String target){
  char c=target.charAt(0);
  if (c > 96 && c < 123)   c=(char)(c - 32);
  return new StringBuilder(prefix.length() + target.length()).append(prefix).append(c).append(target,1,target.length()).toString();
}
  String __target__(String prefix,String target){
  char c=target.charAt(0);
  if (c > 96 && c < 123)   c=(char)(c + 32);
  return new StringBuilder(prefix.length() + target.length()).append(prefix).append(c).append(target,1,target.length()).toString();
}

}