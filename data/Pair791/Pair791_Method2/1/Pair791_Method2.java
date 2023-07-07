import java.util.*;

public class Target {

String truncate(int max,String string){
  if (string.length() > max) {
    return string.substring(0,max);
  }
 else {
    return string;
  }
}
  String __target__(int max,String string){
  if (string.length() >= max) {
    return string.substring(0,max);
  }
 else {
    return string;
  }
}

}