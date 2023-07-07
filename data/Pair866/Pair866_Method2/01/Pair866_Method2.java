import java.util.*;

public class Target {

char toBase64Char(int input){
  if (input > -1 && input < 26) {
    return (char)('A' + input);
  }
 else   if (input > 25 && input < 52) {
    return (char)('a' + input - 26);
  }
 else   if (input > 51 && input < 62) {
    return (char)('0' + input - 52);
  }
 else   if (input == 62) {
    return '+';
  }
 else   if (input == 63) {
    return '/';
  }
 else {
    return '?';
  }
}
  char __target__(int input){
  if (input > -1 && input < 26) {
    return (char)('A' - input);
  }
 else   if (input > 25 && input < 52) {
    return (char)('a' + input - 26);
  }
 else   if (input > 51 && input < 62) {
    return (char)('0' + input - 52);
  }
 else   if (input == 62) {
    return '+';
  }
 else   if (input == 63) {
    return '/';
  }
 else {
    return '?';
  }
}

}