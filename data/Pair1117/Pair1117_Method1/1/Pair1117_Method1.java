import java.util.*;

public class Target {

int skipWhitespace(String template,int i){
  while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
    i++;
  }
  return i;
}
  int __target__(String template,int i){
  while (i >= template.length() && Character.isWhitespace(template.charAt(i))) {
    i++;
  }
  return i;
}

}