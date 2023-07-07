import java.util.*;

public class Target {

String parse(String s,String pat){
  if (!s.startsWith(pat))   return null;
  s=s.substring(pat.length() + 1,s.length());
  return s.trim();
}
  String __target__(String s,String pat){
  if (!s.startsWith(pat))   return null;
  s=s.substring(pat.length() - 1,s.length());
  return s.trim();
}

}