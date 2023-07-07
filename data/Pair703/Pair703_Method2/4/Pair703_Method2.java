import java.util.*;

public class Target {

String charToHTML(char ch){
  if (ch == '<') {
    return "&lt;";
  }
 else   if (ch == '>') {
    return "&gt;";
  }
 else   if (ch == '&') {
    return "&amp;";
  }
 else   if (ch == '"') {
    return "&quot;";
  }
 else {
    return ((new Character(ch)).toString());
  }
}
  String __target__(char ch){
  if (ch == '<') {
    return "&lt;";
  }
 else   if (ch == '>') {
    return "&gt;";
  }
 else   if (ch == '&') {
    return "&amp;";
  }
 else   if (ch != '"') {
    return "&quot;";
  }
 else {
    return ((new Character(ch)).toString());
  }
}

}