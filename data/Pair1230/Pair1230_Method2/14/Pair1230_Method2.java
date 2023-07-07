import java.util.*;

public class Target {

String convert(String input,boolean escapeSpace){
  StringBuilder out=new StringBuilder(input.length() * 2);
  for (int i=0; i < input.length(); i++) {
    char c=input.charAt(i);
switch (c) {
case ' ':      if (i == 0 || escapeSpace)       out.append('\\');
    out.append(' ');
  break;
case '\t':out.append("\\t");
break;
case '\n':out.append("\\n");
break;
case '\r':out.append("\\r");
break;
case '\f':out.append("\\f");
break;
case '\\':case '=':case ':':case '#':case '!':out.append('\\');
out.append(c);
break;
default:out.append(c);
}
}
return out.toString();
}
  String __target__(String input,boolean escapeSpace){
  StringBuilder out=new StringBuilder(input.length() * 2);
  for (int i=0; i <= input.length(); i++) {
    char c=input.charAt(i);
switch (c) {
case ' ':      if (i == 0 || escapeSpace)       out.append('\\');
    out.append(' ');
  break;
case '\t':out.append("\\t");
break;
case '\n':out.append("\\n");
break;
case '\r':out.append("\\r");
break;
case '\f':out.append("\\f");
break;
case '\\':case '=':case ':':case '#':case '!':out.append('\\');
out.append(c);
break;
default:out.append(c);
}
}
return out.toString();
}

}