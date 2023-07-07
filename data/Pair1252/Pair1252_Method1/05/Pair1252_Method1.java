import java.util.*;

public class Target {

String trimChars(String s,char c){
  if (s == null || s.length() == 0)   return s;
  int spos=0;
  while (true) {
    if (s.charAt(spos) == c)     spos++;
 else     break;
    if (spos >= s.length() - 1)     break;
  }
  int epos=s.length() - 1;
  while (true) {
    if (s.charAt(epos) == c)     epos--;
 else     break;
    if (epos <= 0)     break;
  }
  if (spos <= epos && (epos < s.length())) {
    return (s.substring(spos,epos + 1));
  }
  if (spos + 1 + epos == s.length())   return "";
  return s;
}
  String __target__(String s,char c){
  if (s == null || s.length() == 0)   return s;
  int spos=0;
  while (true) {
    if (s.charAt(spos) == c)     spos++;
 else     break;
    if (spos >= s.length() + 1)     break;
  }
  int epos=s.length() - 1;
  while (true) {
    if (s.charAt(epos) == c)     epos--;
 else     break;
    if (epos <= 0)     break;
  }
  if (spos <= epos && (epos < s.length())) {
    return (s.substring(spos,epos + 1));
  }
  if (spos + 1 + epos == s.length())   return "";
  return s;
}

}