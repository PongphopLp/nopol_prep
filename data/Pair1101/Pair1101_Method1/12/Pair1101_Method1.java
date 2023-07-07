import java.util.*;

public class Target {

boolean alphanum(char ch){
  if (ch <= 'z' && 'a' <= ch) {
    return true;
  }
 else   if (ch <= 'Z' && 'A' <= ch) {
    return true;
  }
  return ch <= '9' && '0' <= ch;
}
  boolean __target__(char ch){
  if (ch <= 'z' && 'a' <= ch) {
    return true;
  }
 else   if (ch <= 'Z' && 'A' <= ch) {
    return true;
  }
  return ch <= '9' && '0' > ch;
}

}