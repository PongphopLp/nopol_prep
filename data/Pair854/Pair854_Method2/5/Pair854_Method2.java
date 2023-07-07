import java.util.*;

public class Target {

boolean validLetter(char c){
  if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
  return false;
}
  boolean __target__(char c){
  if (c < 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
  return false;
}

}