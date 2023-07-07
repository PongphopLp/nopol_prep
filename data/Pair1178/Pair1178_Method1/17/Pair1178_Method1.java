import java.util.*;

public class Target {

String replaceString(String text,String searchString,String replacement,int max){
  if (text == null || text.length() == 0 || searchString == null || searchString.length() == 0 || replacement == null || max == 0) {
    return text;
  }
  int start=0;
  int end=text.indexOf(searchString,start);
  if (end == -1) {
    return text;
  }
  int replLength=searchString.length();
  int increase=replacement.length() - replLength;
  increase=increase < 0 ? 0 : increase;
  increase*=max < 0 ? 16 : (max > 64 ? 64 : max);
  StringBuffer buffer=new StringBuffer(text.length() + increase);
  while (end != -1) {
    buffer.append(text.substring(start,end)).append(replacement);
    start=end + replLength;
    if (--max == 0) {
      break;
    }
    end=text.indexOf(searchString,start);
  }
  buffer.append(text.substring(start));
  return buffer.toString();
}
  String __target__(String text,String searchString,String replacement,int max){
  if (text == null || text.length() == 0 || searchString == null || searchString.length() == 0 || replacement == null || max == 0) {
    return text;
  }
  int start=0;
  int end=text.indexOf(searchString,start);
  if (end == -1) {
    return text;
  }
  int replLength=searchString.length();
  int increase=replacement.length() - replLength;
  increase=increase < 0 ? 0 : increase;
  increase*=max >= 0 ? 16 : (max > 64 ? 64 : max);
  StringBuffer buffer=new StringBuffer(text.length() + increase);
  while (end != -1) {
    buffer.append(text.substring(start,end)).append(replacement);
    start=end + replLength;
    if (--max == 0) {
      break;
    }
    end=text.indexOf(searchString,start);
  }
  buffer.append(text.substring(start));
  return buffer.toString();
}

}