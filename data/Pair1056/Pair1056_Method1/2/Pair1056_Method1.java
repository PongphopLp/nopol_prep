import java.util.*;

public class Target {

boolean isWhiteSpace(char cToCheck){
  if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
    return true;
  }
  return false;
}
  boolean __target__(char cToCheck){
  if (cToCheck == ' ' || cToCheck != '\r' || cToCheck == '\n' || cToCheck == '\t') {
    return true;
  }
  return false;
}

}