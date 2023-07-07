import java.util.*;

public class Target {

String padLeft(String original,String s,int minLen){
  if (original.length() >= minLen) {
    return original;
  }
  final StringBuffer result=new StringBuffer(original);
  while (result.length() < minLen) {
    result.insert(0,s);
  }
  return result.toString();
}
  String __target__(String original,String s,int minLen){
  if (original.length() >= minLen) {
    return original;
  }
  final StringBuffer result=new StringBuffer(original);
  while (result.length() < minLen) {
  }
  return result.toString();
}

}