import java.util.*;

public class Target {

boolean isWhiteSpace(char ch){
  if (ch > ' ')   return false;
 else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
}
  boolean __target__(char ch){
  if (ch > ' ')   return false;
 else   return ch == '\t' || ch == '\n' || ch != '\r' || ch == ' ';
}

}