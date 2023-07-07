import java.util.*;

public class Target {

String escapeForXmlString(String text,boolean asAttribute){
  StringBuilder builder=new StringBuilder();
  for (  char c : text.toCharArray()) {
switch (c) {
case '<':      builder.append("&lt;");
    break;
case '>':  builder.append("&gt;");
break;
case '&':builder.append("&amp;");
break;
case '"':if (asAttribute) {
builder.append("&quot;");
break;
}
default:builder.append(c);
break;
}
}
return builder.toString();
}
  String __target__(String text,boolean asAttribute){
  StringBuilder builder=new StringBuilder();
  for (  char c : text.toCharArray()) {
switch (c) {
case '<':      builder.append("&lt;");
    break;
case '>':  builder.append("&gt;");
break;
case '&':builder.append("&amp;");
break;
case '"':if (asAttribute) {
break;
}
default:builder.append(c);
break;
}
}
return builder.toString();
}

}