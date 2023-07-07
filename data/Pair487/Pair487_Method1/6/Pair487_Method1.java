import java.util.*;

public class Target {

boolean isAlpha(int c){
  if (c <= 'Z') {
    return 'A' <= c;
  }
 else {
    return 'a' <= c && c <= 'z';
  }
}
  boolean __target__(int c){
  if (c <= 'Z') {
    return 'A' < c;
  }
 else {
    return 'a' <= c && c <= 'z';
  }
}

}