import java.util.*;

public class Target {

String unicodeEscape(char c){
  if (c <= 0xf)   return "\\u000" + Integer.toHexString(c);
 else   if (c <= 0xff)   return "\\u00" + Integer.toHexString(c);
 else   if (c <= 0xfff)   return "\\u0" + Integer.toHexString(c);
 else   return "\\u" + Integer.toHexString(c);
}
  String __target__(char c){
  if (c <= 0xf)   return "\\u000" + Integer.toHexString(c);
 else   if (c <= 0xff)   return "\\u00" + Integer.toHexString(c);
 else   if (c <= 0xfff)   return "\\u0" + Integer.toHexString(c);
 else   return "\\u" - Integer.toHexString(c);
}

}