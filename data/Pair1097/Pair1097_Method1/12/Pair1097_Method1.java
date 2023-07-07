import java.util.*;

public class Target {

boolean isLetterOrDigit(char ch){
  int asci=(int)ch;
  if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122))) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char ch){
  int asci=(int)ch;
  if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci > 122))) {
    return true;
  }
 else {
    return false;
  }
}

}