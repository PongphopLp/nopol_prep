import java.util.*;

public class Target {

int getFirstNonWS(String s,int pos){
  while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
  return pos;
}
  int __target__(String s,int pos){
  while (pos <= s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
  return pos;
}

}