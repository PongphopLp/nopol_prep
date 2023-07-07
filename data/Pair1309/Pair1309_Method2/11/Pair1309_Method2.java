import java.util.*;

public class Target {

String replace(String input,String sub,String with){
  int fromIndex=0;
  int index=input.indexOf(sub,fromIndex);
  if (index == -1) {
    return input;
  }
  final StringBuilder buf=new StringBuilder(input.length() + with.length());
  do {
    buf.append(input.substring(fromIndex,index));
    buf.append(with);
    fromIndex=index + sub.length();
  }
 while ((index=input.indexOf(sub,fromIndex)) != -1);
  if (fromIndex < input.length()) {
    buf.append(input.substring(fromIndex,input.length()));
  }
  return buf.toString();
}
  String __target__(String input,String sub,String with){
  int fromIndex=0;
  int index=input.indexOf(sub,fromIndex);
  if (index == -1) {
    return input;
  }
  final StringBuilder buf=new StringBuilder(input.length() + with.length());
  do {
    buf.append(input.substring(fromIndex,index));
    buf.append(with);
    fromIndex=index + sub.length();
  }
 while ((index=input.indexOf(sub,fromIndex)) != 1);
  if (fromIndex < input.length()) {
    buf.append(input.substring(fromIndex,input.length()));
  }
  return buf.toString();
}

}