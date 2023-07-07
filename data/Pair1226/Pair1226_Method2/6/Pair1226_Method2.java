import java.util.*;

public class Target {

String strictHtmlEncode(String rawText,boolean quotes){
  StringBuffer output=new StringBuffer();
  int length=rawText.length();
  for (int i=0; i < length; i++) {
    char ch=rawText.charAt(i);
switch (ch) {
case '&':      output.append("&amp;");
    break;
case '"':  if (quotes) {
    output.append("&quot;");
  }
 else {
    output.append(ch);
  }
break;
case '<':output.append("&lt;");
break;
case '>':output.append("&gt;");
break;
default:output.append(ch);
}
}
return output.toString();
}
  String __target__(String rawText,boolean quotes){
  StringBuffer output=new StringBuffer();
  int length=rawText.length();
  for (int i=0; i < length; i++) {
    char ch=rawText.charAt(i);
switch (ch) {
case '&':      output.append("&amp;");
    break;
case '"':  if (quotes) {
    output.append("&quot;");
  }
 else {
  }
break;
case '<':output.append("&lt;");
break;
case '>':output.append("&gt;");
break;
default:output.append(ch);
}
}
return output.toString();
}

}