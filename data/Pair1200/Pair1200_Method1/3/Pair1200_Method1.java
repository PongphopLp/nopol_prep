import java.util.*;

public class Target {

String fitStringWidth(String string,int width){
  if (string.length() > width) {
    string=string.substring(0,width);
  }
 else   if (string.length() < width) {
    char[] fill=new char[width - string.length()];
    Arrays.fill(fill,' ');
    string+=new String(fill);
  }
  return string;
}
  String __target__(String string,int width){
  if (string.length() <= width) {
    string=string.substring(0,width);
  }
 else   if (string.length() < width) {
    char[] fill=new char[width - string.length()];
    Arrays.fill(fill,' ');
    string+=new String(fill);
  }
  return string;
}

}