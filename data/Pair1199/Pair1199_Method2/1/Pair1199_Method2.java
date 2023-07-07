import java.util.*;

public class Target {

String extractString(String source,String start,String end){
  int i=source.indexOf(start);
  int j=source.indexOf(end);
  if (i > -1 && j > -1) {
    return source.substring(i + start.length(),j);
  }
  return "";
}
  String __target__(String source,String start,String end){
  int i=source.indexOf(start);
  int j=source.indexOf(end);
  if (i <= -1 && j > -1) {
    return source.substring(i + start.length(),j);
  }
  return "";
}

}