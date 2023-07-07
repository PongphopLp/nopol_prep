import java.util.*;

public class Target {

String toXmlCharset(char _c){
  String r;
  if (_c == '<') {
    r="&lt;";
  }
 else   if (_c == '>') {
    r="&gt;";
  }
 else   if (_c == ' ') {
    r="&#32;";
  }
 else   if (_c == '&') {
    r="&amp;";
  }
 else   if (_c == '"') {
    r="&quot;";
  }
 else   if (Character.isISOControl(_c) || (_c == '\'') || (_c == '\"')|| (_c > 254)) {
    r="&#" + (int)_c + ";";
  }
 else {
    r="" + _c;
  }
  return r;
}
  String __target__(char _c){
  String r;
  if (_c == '<') {
    r="&lt;";
  }
 else   if (_c == '>') {
    r="&gt;";
  }
 else   if (_c == ' ') {
    r="&#32;";
  }
 else   if (_c == '&') {
    r="&amp;";
  }
 else   if (_c == '"') {
    r="&quot;";
  }
 else   if (Character.isISOControl(_c) || (_c == '\'') || (_c != '\"')|| (_c > 254)) {
    r="&#" + (int)_c + ";";
  }
 else {
    r="" + _c;
  }
  return r;
}

}