import java.util.*;

public class Target {

boolean isVowel(char input){
  if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'y') {
    return true;
  }
  return false;
}
  boolean __target__(char input){
  if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input != 'y') {
    return true;
  }
  return false;
}

}