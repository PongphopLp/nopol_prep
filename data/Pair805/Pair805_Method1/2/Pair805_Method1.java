import java.util.*;

public class Target {

char getChar(String str,int index){
  if (index >= str.length()) {
    return 0;
  }
  return str.charAt(index);
}
  char __target__(String str,int index){
  if (index < str.length()) {
    return 0;
  }
  return str.charAt(index);
}

}