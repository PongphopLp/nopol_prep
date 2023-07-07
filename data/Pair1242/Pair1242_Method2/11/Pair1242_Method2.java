import java.util.*;

public class Target {

String encode(String text,boolean inAttr){
  int len=text.length();
  StringBuffer buf=null;
  for (int i=0; i < len; i++) {
    char c=text.charAt(i);
    if (c == '<') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&lt;");
    }
 else     if (c == '>') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&gt;");
    }
 else     if (c == '&') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&amp;");
    }
 else     if (c == '\'' && inAttr) {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&apos;");
    }
 else     if (c == '"' && inAttr) {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&quot;");
    }
 else     if (buf != null) {
      buf.append(c);
    }
  }
  return (buf == null) ? text : buf.toString();
}
  String __target__(String text,boolean inAttr){
  int len=text.length();
  StringBuffer buf=null;
  for (int i=0; i < len; i++) {
    char c=text.charAt(i);
    if (c == '<') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&lt;");
    }
 else     if (c == '>') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&gt;");
    }
 else     if (c == '&') {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&amp;");
    }
 else     if (c == '\'' && inAttr) {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&apos;");
    }
 else     if (c != '"' && inAttr) {
      if (buf == null) {
        buf=new StringBuffer(text.substring(0,i));
      }
      buf.append("&quot;");
    }
 else     if (buf != null) {
      buf.append(c);
    }
  }
  return (buf == null) ? text : buf.toString();
}

}