import java.util.*;

public class Target {

String escape(String str,boolean isKey){
  int len=str.length();
  StringBuffer outBuffer=new StringBuffer(len * 2);
  for (int index=0; index < len; index++) {
    char c=str.charAt(index);
switch (c) {
case ' ':      if (index == 0 || isKey) {
        outBuffer.append('\\');
      }
    outBuffer.append(' ');
  break;
case '\\':outBuffer.append("\\\\");
break;
case '\t':outBuffer.append("\\t");
break;
case '\n':outBuffer.append("\\n");
break;
case '\r':outBuffer.append("\\r");
break;
case '\f':outBuffer.append("\\f");
break;
default:if ("=: \t\r\n\f#!".indexOf(c) != -1) {
outBuffer.append('\\');
}
outBuffer.append(c);
}
}
return outBuffer.toString();
}
  String __target__(String str,boolean isKey){
  int len=str.length();
  StringBuffer outBuffer=new StringBuffer(len * 2);
  for (int index=0; index < len; index++) {
    char c=str.charAt(index);
switch (c) {
case ' ':      if (index == 0 || isKey) {
        outBuffer.append('\\');
      }
    break;
case '\\':outBuffer.append("\\\\");
break;
case '\t':outBuffer.append("\\t");
break;
case '\n':outBuffer.append("\\n");
break;
case '\r':outBuffer.append("\\r");
break;
case '\f':outBuffer.append("\\f");
break;
default:if ("=: \t\r\n\f#!".indexOf(c) != -1) {
outBuffer.append('\\');
}
outBuffer.append(c);
}
}
return outBuffer.toString();
}

}