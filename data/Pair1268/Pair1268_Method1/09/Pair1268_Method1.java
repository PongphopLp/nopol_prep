import java.util.*;

public class Target {

String replace(String in,String match,String replacement){
  if (in == null || match == null || replacement == null) {
    return in;
  }
  StringBuffer out=new StringBuffer();
  int matchLength=match.length();
  int inLength=in.length();
  for (int i=0; i < inLength; i++) {
    int upperSearhLimit=i + matchLength;
    if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
      out.append(replacement);
      i=upperSearhLimit - 1;
    }
 else {
      out.append(in.charAt(i));
    }
  }
  return out.toString();
}
  String __target__(String in,String match,String replacement){
  if (in == null || match == null || replacement == null) {
    return in;
  }
  StringBuffer out=new StringBuffer();
  int matchLength=match.length();
  int inLength=in.length();
  for (int i=0; i < inLength; i++) {
    int upperSearhLimit=i + matchLength;
    if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
      i=upperSearhLimit - 1;
    }
 else {
      out.append(in.charAt(i));
    }
  }
  return out.toString();
}

}