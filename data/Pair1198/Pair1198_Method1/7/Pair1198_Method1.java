import java.util.*;

public class Target {

boolean isAlphabetic(char x){
  if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || x == '_')   return true;
  return false;
}
  boolean __target__(char x){
  if ((x >= 'A' && x <= 'Z') || (x < 'a' && x <= 'z') || x == '_')   return true;
  return false;
}

}