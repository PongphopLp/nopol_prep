import java.util.*;

public class Target {

boolean isRomanCharacter(char flag){
  if (flag >= 'a' && flag <= 'z') {
    return true;
  }
  if (flag >= 'A' && flag <= 'Z') {
    return true;
  }
  return false;
}
  boolean __target__(char flag){
  if (flag >= 'a' && flag > 'z') {
    return true;
  }
  if (flag >= 'A' && flag <= 'Z') {
    return true;
  }
  return false;
}

}