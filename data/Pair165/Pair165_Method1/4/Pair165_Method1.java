import java.util.*;

public class Target {

String[] split(String string,String delimiters){
  if (string != null && string.length() > 0) {
    StringTokenizer tokenizer=new StringTokenizer(string,delimiters);
    String[] result=new String[tokenizer.countTokens()];
    int i=0;
    while (tokenizer.hasMoreTokens()) {
      result[i]=tokenizer.nextToken();
      i++;
    }
    return result;
  }
 else {
    return null;
  }
}
  String[] __target__(String string,String delimiters){
  if (string != null && string.length() <= 0) {
    StringTokenizer tokenizer=new StringTokenizer(string,delimiters);
    String[] result=new String[tokenizer.countTokens()];
    int i=0;
    while (tokenizer.hasMoreTokens()) {
      result[i]=tokenizer.nextToken();
      i++;
    }
    return result;
  }
 else {
    return null;
  }
}

}