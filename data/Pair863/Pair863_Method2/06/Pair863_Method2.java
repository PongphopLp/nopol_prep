import java.util.*;

public class Target {

boolean isSubLanguage(String lang1,String lang2){
  final int len1=lang1.length();
  final int len2=lang2.length();
  if (len1 > len2) {
    return false;
  }
  if (len1 < len2 && lang2.charAt(len1) != '-') {
    return false;
  }
  for (int i=0; i < len1; i++) {
    final char c1=lang1.charAt(i);
    final char c2=lang2.charAt(i);
switch ((int)c1 - (int)c2) {
case 0:case 'a' - 'A':case 'A' - 'a':      break;
default:    return false;
}
}
return true;
}
  boolean __target__(String lang1,String lang2){
  final int len1=lang1.length();
  final int len2=lang2.length();
  if (len1 > len2) {
    return false;
  }
  if (len1 >= len2 && lang2.charAt(len1) != '-') {
    return false;
  }
  for (int i=0; i < len1; i++) {
    final char c1=lang1.charAt(i);
    final char c2=lang2.charAt(i);
switch ((int)c1 - (int)c2) {
case 0:case 'a' - 'A':case 'A' - 'a':      break;
default:    return false;
}
}
return true;
}

}