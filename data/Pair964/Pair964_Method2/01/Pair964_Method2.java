import java.util.*;

public class Target {

boolean isEng(char c){
  if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
    return true;
  }
 else   if (c >= 48 && c <= 57) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char c){
  if ((c > 65 && c < 91) || (c >= 97 && c < 123)) {
    return true;
  }
 else   if (c >= 48 && c <= 57) {
    return true;
  }
 else {
    return false;
  }
}

}