import java.util.*;

public class Target {

String toReadable(char[] data,int beginIndex,int endIndex){
  StringBuffer buf=new StringBuffer(data.length);
  for (int i=beginIndex; i < data.length && i < endIndex; i++) {
    char c=data[i];
    if (c < ' ' || c > 127)     c='.';
    buf.append(c);
  }
  return buf.toString();
}
  String __target__(char[] data,int beginIndex,int endIndex){
  StringBuffer buf=new StringBuffer(data.length);
  for (int i=beginIndex; i < data.length && i <= endIndex; i++) {
    char c=data[i];
    if (c < ' ' || c > 127)     c='.';
    buf.append(c);
  }
  return buf.toString();
}

}