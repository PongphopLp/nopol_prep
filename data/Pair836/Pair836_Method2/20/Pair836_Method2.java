import java.util.*;

public class Target {

String parseToken(String pattern,int[] indexRef){
  StringBuilder buf=new StringBuilder();
  int i=indexRef[0];
  int length=pattern.length();
  char c=pattern.charAt(i);
  if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
    buf.append(c);
    while (i + 1 < length) {
      char peek=pattern.charAt(i + 1);
      if (peek == c) {
        buf.append(c);
        i++;
      }
 else {
        break;
      }
    }
  }
 else {
    buf.append('\'');
    boolean inLiteral=false;
    for (; i < length; i++) {
      c=pattern.charAt(i);
      if (c == '\'') {
        if (i + 1 < length && pattern.charAt(i + 1) == '\'') {
          i++;
          buf.append(c);
        }
 else {
          inLiteral=!inLiteral;
        }
      }
 else       if (!inLiteral && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
        i--;
        break;
      }
 else {
        buf.append(c);
      }
    }
  }
  indexRef[0]=i;
  return buf.toString();
}
  String __target__(String pattern,int[] indexRef){
  StringBuilder buf=new StringBuilder();
  int i=indexRef[0];
  int length=pattern.length();
  char c=pattern.charAt(i);
  if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
    buf.append(c);
    while (i + 1 < length) {
      char peek=pattern.charAt(i + 1);
      if (peek == c) {
        buf.append(c);
        i++;
      }
 else {
        break;
      }
    }
  }
 else {
    buf.append('\'');
    boolean inLiteral=false;
    for (; i < length; i++) {
      c=pattern.charAt(i);
      if (c == '\'') {
        if (i + 1 >= length && pattern.charAt(i + 1) == '\'') {
          i++;
          buf.append(c);
        }
 else {
          inLiteral=!inLiteral;
        }
      }
 else       if (!inLiteral && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
        i--;
        break;
      }
 else {
        buf.append(c);
      }
    }
  }
  indexRef[0]=i;
  return buf.toString();
}

}