import java.util.*;

public class Target {

String maxLength(String text,int maxLength){
  if (text.length() > maxLength) {
    return text.substring(0,maxLength - 3) + "...";
  }
  return text;
}
  String __target__(String text,int maxLength){
  if (text.length() > maxLength) {
    return text.substring(0,maxLength + 3) + "...";
  }
  return text;
}

}