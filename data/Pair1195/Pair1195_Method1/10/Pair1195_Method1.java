import java.util.*;

public class Target {

boolean isLegalCharacter(char c){
  if (c == 0x9 || c == 0xA || c == 0xD) {
    return true;
  }
 else   if (c < 0x20) {
    return false;
  }
 else   if (c <= 0xD7FF) {
    return true;
  }
 else   if (c < 0xE000) {
    return false;
  }
 else   if (c <= 0xFFFD) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if (c == 0x9 || c == 0xA || c == 0xD) {
    return true;
  }
 else   if (c < 0x20) {
    return false;
  }
 else   if (c <= 0xD7FF) {
    return true;
  }
 else   if (c <= 0xE000) {
    return false;
  }
 else   if (c <= 0xFFFD) {
    return true;
  }
  return false;
}

}