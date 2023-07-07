import java.util.*;

public class Target {

String chopString(String string,int numChars,String trailer){
  if (string.length() > numChars) {
    String result=string.substring(0,numChars);
    return result + trailer;
  }
 else {
    return string;
  }
}
  String __target__(String string,int numChars,String trailer){
  if (string.length() > numChars) {
    String result=string.substring(0,numChars);
    return result - trailer;
  }
 else {
    return string;
  }
}

}