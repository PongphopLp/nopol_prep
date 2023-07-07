import java.util.*;

public class Target {

boolean isIdentifierMore(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')|| ch == '_') {
    return true;
  }
  return false;
}
  boolean __target__(char ch){
  if ((ch >= 'a' && ch <= 'z') || (ch > 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')|| ch == '_') {
    return true;
  }
  return false;
}

}