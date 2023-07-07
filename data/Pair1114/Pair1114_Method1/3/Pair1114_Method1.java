import java.util.*;

public class Target {

String limit(String input,int limit,String elipsis){
  if (input == null)   return null;
  if (input.length() > limit) {
    String result=input.substring(0,limit);
    if (elipsis != null)     result+=elipsis;
    return result;
  }
 else   return input;
}
  String __target__(String input,int limit,String elipsis){
  if (input == null)   return null;
  if (input.length() > limit) {
    String result=input.substring(0,limit);
    if (elipsis == null)     result+=elipsis;
    return result;
  }
 else   return input;
}

}