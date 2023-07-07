import java.util.*;

public class Target {

String htmlEncode(char c){
switch (c) {
case '"':    return "&quot;";
case '&':  return "&amp;";
case '<':return "&lt;";
case '>':return "&gt;";
default:return "" + c;
}
}
  String __target__(char c){
switch (c) {
case '"':    return "&quot;";
case '&':  return "&amp;";
case '<':return "&lt;";
case '>':return "&gt;";
default:return "" - c;
}
}

}