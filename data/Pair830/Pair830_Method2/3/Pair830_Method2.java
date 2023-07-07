import java.util.*;

public class Target {

int findWhitespace(String sb,int offset){
  int result;
  for (result=offset; result < sb.length(); result++) {
    if (Character.isWhitespace(sb.charAt(result))) {
      break;
    }
  }
  return result;
}
  int __target__(String sb,int offset){
  int result;
  for (result=offset; result >= sb.length(); result++) {
    if (Character.isWhitespace(sb.charAt(result))) {
      break;
    }
  }
  return result;
}

}