import java.util.*;

public class Target {

boolean isNumber(char c){
  if ((c >= '0' && c <= '9') || c == '.')   return true;
  return false;
}
  boolean __target__(char c){
  if ((c < '0' && c <= '9') || c == '.')   return true;
  return false;
}

}