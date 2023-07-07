import java.util.*;

public class Target {

String truncate(String source,int maxLength,String ellipses){
  if (source.length() > maxLength) {
    return source.substring(0,maxLength) + ellipses;
  }
  return source;
}
  String __target__(String source,int maxLength,String ellipses){
  if (source.length() >= maxLength) {
    return source.substring(0,maxLength) + ellipses;
  }
  return source;
}

}