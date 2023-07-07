import java.util.*;

public class Target {

char getMnemonic(String text){
  int pos=text.indexOf("&");
  if (pos != -1) {
    return text.charAt(pos + 1);
  }
  return 0;
}
  char __target__(String text){
  int pos=text.indexOf("&");
  if (pos != -1) {
    return text.charAt(pos - 1);
  }
  return 0;
}

}