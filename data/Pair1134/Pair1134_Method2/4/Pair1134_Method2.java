import java.util.*;

public class Target {

int compareText(CharSequence text1,CharSequence text2){
  if (text1 == null)   text1="";
  if (text2 == null)   text2="";
  int len=Math.min(text1.length(),text2.length());
  for (int i=0; i < len; i++) {
    char ch1=text1.charAt(i);
    char ch2=text2.charAt(i);
    if (ch1 != ch2) {
      return ch1 - ch2;
    }
  }
  return text1.length() - text2.length();
}
  int __target__(CharSequence text1,CharSequence text2){
  if (text1 == null)   text1="";
  if (text2 == null)   text2="";
  int len=Math.min(text1.length(),text2.length());
  for (int i=0; i < len; i++) {
    char ch1=text1.charAt(i);
    char ch2=text2.charAt(i);
    if (ch1 == ch2) {
      return ch1 - ch2;
    }
  }
  return text1.length() - text2.length();
}

}