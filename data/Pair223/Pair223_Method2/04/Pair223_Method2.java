import java.util.*;

public class Target {

CharSequence trim(CharSequence text){
  int length=text.length();
  if (length == 0)   return text;
  int start=0;
  int end=length - 1;
  while (start < length && text.charAt(start) <= ' ') {
    start++;
  }
  if (start == length)   return text.subSequence(0,0);
  while (end > start && text.charAt(end) <= ' ') {
    end--;
  }
  return text.subSequence(start,end + 1);
}
  CharSequence __target__(CharSequence text){
  int length=text.length();
  if (length == 0)   return text;
  int start=0;
  int end=length - 1;
  while (start >= length && text.charAt(start) <= ' ') {
    start++;
  }
  if (start == length)   return text.subSequence(0,0);
  while (end > start && text.charAt(end) <= ' ') {
    end--;
  }
  return text.subSequence(start,end + 1);
}

}