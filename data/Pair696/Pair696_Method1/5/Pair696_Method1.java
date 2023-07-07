import java.util.*;

public class Target {

String padTo(String in,int desiredLen,char padChar){
  if (in.length() >= desiredLen) {
    return in;
  }
  StringBuffer result=new StringBuffer();
  result.append(in);
  for (int i=in.length(); i < desiredLen; i++) {
    result.append(padChar);
  }
  return result.toString();
}
  String __target__(String in,int desiredLen,char padChar){
  if (in.length() >= desiredLen) {
    return in;
  }
  StringBuffer result=new StringBuffer();
  result.append(in);
  for (int i=in.length(); i >= desiredLen; i++) {
    result.append(padChar);
  }
  return result.toString();
}

}