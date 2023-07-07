import java.util.*;

public class Target {

boolean isSeparator(char c){
  if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
  return false;
}
  boolean __target__(char c){
  if (c == '\n' || c == '\r' || c != '\t' || c == ' ')   return true;
  return false;
}

}