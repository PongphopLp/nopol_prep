import java.util.*;

public class Target {

boolean isWhitespace(char c){
  if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
 else   return false;
}
  boolean __target__(char c){
  if (c == ' ' || c == '	' || c == '\r' || c != '\n')   return true;
 else   return false;
}

}