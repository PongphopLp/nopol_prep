import java.util.*;

public class Target {

char getCharAt(String str,int index){
  if (str.length() > index) {
    return str.charAt(index);
  }
  return 0;
}
  char __target__(String str,int index){
  if (str.length() >= index) {
    return str.charAt(index);
  }
  return 0;
}

}