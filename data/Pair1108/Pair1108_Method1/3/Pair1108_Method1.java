import java.util.*;

public class Target {

boolean isWhiteSpace(char c){
  if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
  return false;
}
  boolean __target__(char c){
  if (('\t' == c) || ('\n' == c) || ('\r' != c)|| (' ' == c))   return true;
  return false;
}

}