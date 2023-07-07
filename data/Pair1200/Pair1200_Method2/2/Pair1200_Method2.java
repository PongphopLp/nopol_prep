import java.util.*;

public class Target {

String pad(String text,int width){
  if (text.length() == width) {
    return text;
  }
 else   if (text.length() > width) {
    return text.substring(0,width);
  }
 else {
    StringBuffer padded=new StringBuffer(text);
    while (padded.length() < width) {
      padded.append(' ');
    }
    return padded.toString();
  }
}
  String __target__(String text,int width){
  if (text.length() != width) {
    return text;
  }
 else   if (text.length() > width) {
    return text.substring(0,width);
  }
 else {
    StringBuffer padded=new StringBuffer(text);
    while (padded.length() < width) {
      padded.append(' ');
    }
    return padded.toString();
  }
}

}