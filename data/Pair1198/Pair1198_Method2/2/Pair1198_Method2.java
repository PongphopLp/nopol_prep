import java.util.*;

public class Target {

boolean IsChar(char c){
  if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_')   return true;
 else   return false;
}
  boolean __target__(char c){
  if ((c >= 'a' && c < 'z') || (c >= 'A' && c <= 'Z') || c == '_')   return true;
 else   return false;
}

}