import java.util.*;

public class Target {

boolean isIdentifierStart(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch < 'Z')) {
    return true;
  }
  return false;
}

}