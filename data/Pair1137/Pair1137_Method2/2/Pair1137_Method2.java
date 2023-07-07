import java.util.*;

public class Target {

boolean isValidAlphabeticCharacter(char aChar){
  if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
    return false;
  }
  return true;
}
  boolean __target__(char aChar){
  if (((aChar < 'A') || (aChar >= 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
    return false;
  }
  return true;
}

}