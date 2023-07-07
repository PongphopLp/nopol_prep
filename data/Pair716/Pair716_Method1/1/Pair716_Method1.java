import java.util.*;

public class Target {

String toXMLString(char c){
  if (c == '<') {
    return "&lt;";
  }
 else   if (c == '>') {
    return "&gt;";
  }
 else   if (c == '&') {
    return "&amp;";
  }
 else   if (c == '"') {
    return "&quot;";
  }
 else {
    return String.valueOf(c);
  }
}
  String __target__(char c){
  if (c != '<') {
    return "&lt;";
  }
 else   if (c == '>') {
    return "&gt;";
  }
 else   if (c == '&') {
    return "&amp;";
  }
 else   if (c == '"') {
    return "&quot;";
  }
 else {
    return String.valueOf(c);
  }
}

}