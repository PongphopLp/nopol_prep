import java.util.*;

public class Target {

boolean VALID_XML11_FIRST_LETTERS(char c){
  if ((c >= 'A') && (c <= 'Z')) {
    return true;
  }
  if ((c >= 'a') && (c <= 'z')) {
    return true;
  }
  if ((c == '_') || (c == ':')) {
    return true;
  }
  if ((c >= 0x00C0) && (c <= 0x00D6)) {
    return true;
  }
  if ((c >= 0x00D8) && (c <= 0x00F6)) {
    return true;
  }
  if ((c >= 0x00F8) && (c <= 0x02FF)) {
    return true;
  }
  if ((c >= 0x0370) && (c <= 0x037D)) {
    return true;
  }
  if ((c >= 0x037F) && (c <= 0x1FFF)) {
    return true;
  }
  if ((c >= 0x200C) && (c <= 0x200D)) {
    return true;
  }
  if ((c >= 0x2070) && (c <= 0x218F)) {
    return true;
  }
  if ((c >= 0x2C00) && (c <= 0x2FEF)) {
    return true;
  }
  if ((c >= 0x3001) && (c <= 0xD7FF)) {
    return true;
  }
  if ((c >= 0xF900) && (c <= 0xFDCF)) {
    return true;
  }
  if ((c >= 0xFDF0) && (c <= 0xFFFD)) {
    return true;
  }
  if ((c >= 0x10000) && (c <= 0xEFFFF)) {
    return true;
  }
  return false;
}
  boolean __target__(char c){
  if ((c >= 'A') && (c <= 'Z')) {
    return true;
  }
  if ((c >= 'a') && (c <= 'z')) {
    return true;
  }
  if ((c == '_') || (c == ':')) {
    return true;
  }
  if ((c >= 0x00C0) && (c <= 0x00D6)) {
    return true;
  }
  if ((c >= 0x00D8) && (c <= 0x00F6)) {
    return true;
  }
  if ((c >= 0x00F8) && (c <= 0x02FF)) {
    return true;
  }
  if ((c >= 0x0370) && (c <= 0x037D)) {
    return true;
  }
  if ((c >= 0x037F) && (c <= 0x1FFF)) {
    return true;
  }
  if ((c >= 0x200C) && (c <= 0x200D)) {
    return true;
  }
  if ((c >= 0x2070) && (c <= 0x218F)) {
    return true;
  }
  if ((c >= 0x2C00) && (c <= 0x2FEF)) {
    return true;
  }
  if ((c >= 0x3001) && (c <= 0xD7FF)) {
    return true;
  }
  if ((c >= 0xF900) && (c <= 0xFDCF)) {
    return true;
  }
  if ((c > 0xFDF0) && (c <= 0xFFFD)) {
    return true;
  }
  if ((c >= 0x10000) && (c <= 0xEFFFF)) {
    return true;
  }
  return false;
}

}