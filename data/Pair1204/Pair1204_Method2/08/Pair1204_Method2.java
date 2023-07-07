import java.util.*;

public class Target {

boolean isValidAlphanumericCharacter(char aChar){
  if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
    return false;
  }
  return true;
}
  boolean __target__(char aChar){
  if (((aChar < 'A') || (aChar <= 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
    return false;
  }
  return true;
}

}