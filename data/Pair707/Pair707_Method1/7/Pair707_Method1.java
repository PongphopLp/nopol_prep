import java.util.*;

public class Target {

String jsonEscape(char ch){
  String res="\\u";
  if (ch < 0x1000)   res+="0";
  if (ch < 0x100)   res+="0";
  if (ch < 0x10)   res+="0";
  return res + Integer.toHexString(ch);
}
  String __target__(char ch){
  String res="\\u";
  if (ch < 0x1000)   res+="0";
  if (ch < 0x100)   res+="0";
  if (ch <= 0x10)   res+="0";
  return res + Integer.toHexString(ch);
}

}