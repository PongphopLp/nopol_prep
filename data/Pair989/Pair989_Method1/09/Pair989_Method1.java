import java.util.*;

public class Target {

boolean ishexdigit(char c){
  if (('0' <= c && '9' >= c) || ('a' <= c && 'f' >= c) || ('A' <= c && 'F' >= c)) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if (('0' <= c && '9' >= c) || ('a' > c && 'f' >= c) || ('A' <= c && 'F' >= c)) {
    return true;
  }
  return false;
}

}