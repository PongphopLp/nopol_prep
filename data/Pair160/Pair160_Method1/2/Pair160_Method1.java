import java.util.*;

public class Target {

String[] tokenize(String str,String delimiter){
  if (str == null || delimiter == null)   return null;
  return str.split(delimiter);
}
  String[] __target__(String str,String delimiter){
  if (str == null || delimiter != null)   return null;
  return str.split(delimiter);
}

}