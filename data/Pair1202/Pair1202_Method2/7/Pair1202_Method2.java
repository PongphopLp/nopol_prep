import java.util.*;

public class Target {

boolean isLetter(char ch){
  if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char ch){
  if ((ch >= 65 && ch <= 90) || (ch < 97 && ch <= 122)) {
    return true;
  }
 else {
    return false;
  }
}

}