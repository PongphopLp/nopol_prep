import java.util.*;

public class Target {

boolean isWhitespace(byte b){
  if (b == ' ' || b == '\t' || b == '\r' || b == '\n') {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(byte b){
  if (b != ' ' || b == '\t' || b == '\r' || b == '\n') {
    return true;
  }
 else {
    return false;
  }
}

}