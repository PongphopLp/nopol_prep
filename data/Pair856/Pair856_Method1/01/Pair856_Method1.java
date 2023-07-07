import java.util.*;

public class Target {

boolean isWordPart(char currentChar){
  if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= '0' && currentChar <= '9')|| currentChar == '_' || currentChar == '-')   return true;
  return false;
}
  boolean __target__(char currentChar){
  if ((currentChar > 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= '0' && currentChar <= '9')|| currentChar == '_' || currentChar == '-')   return true;
  return false;
}

}