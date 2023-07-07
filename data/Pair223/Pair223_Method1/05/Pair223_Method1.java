import java.util.*;

public class Target {

CharSequence trim(CharSequence jsonText){
  int len=jsonText.length();
  int st=0;
  int off=0;
  while ((st < len) && (jsonText.charAt(off + st) <= ' '))   st++;
  while ((st < len) && (jsonText.charAt(off + len - 1) <= ' '))   len--;
  return ((st > 0) || (len < jsonText.length())) ? jsonText.subSequence(st,len) : jsonText;
}
  CharSequence __target__(CharSequence jsonText){
  int len=jsonText.length();
  int st=0;
  int off=0;
  while ((st < len) && (jsonText.charAt(off + st) > ' '))   st++;
  while ((st < len) && (jsonText.charAt(off + len - 1) <= ' '))   len--;
  return ((st > 0) || (len < jsonText.length())) ? jsonText.subSequence(st,len) : jsonText;
}

}