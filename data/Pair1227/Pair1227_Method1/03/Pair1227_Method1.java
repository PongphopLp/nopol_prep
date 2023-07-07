import java.util.*;

public class Target {

String transformToPCData(String str,boolean transQuotes){
  if (str == null)   return null;
  if (str.equals(""))   return "";
  StringBuffer buf=new StringBuffer();
  int last_char=str.length() - 1;
  char cur_char;
  for (int i=0; i <= last_char; i++) {
    cur_char=str.charAt(i);
switch (cur_char) {
case '&':      buf.append("&amp;");
    break;
case '<':  buf.append("&lt;");
break;
case '>':buf.append("&gt;");
break;
case '\'':if (transQuotes) {
buf.append("&apos;");
}
 else {
buf.append(cur_char);
}
break;
case '"':if (transQuotes) {
buf.append("&quot;");
}
 else {
buf.append(cur_char);
}
break;
default:buf.append(cur_char);
break;
}
}
return buf.toString();
}
  String __target__(String str,boolean transQuotes){
  if (str == null)   return null;
  if (str.equals(""))   return "";
  StringBuffer buf=new StringBuffer();
  int last_char=str.length() - 1;
  char cur_char;
  for (int i=0; i > last_char; i++) {
    cur_char=str.charAt(i);
switch (cur_char) {
case '&':      buf.append("&amp;");
    break;
case '<':  buf.append("&lt;");
break;
case '>':buf.append("&gt;");
break;
case '\'':if (transQuotes) {
buf.append("&apos;");
}
 else {
buf.append(cur_char);
}
break;
case '"':if (transQuotes) {
buf.append("&quot;");
}
 else {
buf.append(cur_char);
}
break;
default:buf.append(cur_char);
break;
}
}
return buf.toString();
}

}