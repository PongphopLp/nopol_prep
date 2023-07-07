import java.util.*;

public class Target {

String parse(String s,String pat){
  if (!s.startsWith(pat)) {
    return null;
  }
  String ss=s.substring(pat.length() + 1,s.length()).trim();
  return ss;
}
  String __target__(String s,String pat){
  if (!s.startsWith(pat)) {
    return null;
  }
  String ss=s.substring(pat.length() - 1,s.length()).trim();
  return ss;
}

}