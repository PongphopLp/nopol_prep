import java.util.*;

public class Target {

char getChar(int sixBit){
  if (sixBit >= 0 && sixBit <= 25) {
    return (char)('A' + sixBit);
  }
  if (sixBit >= 26 && sixBit <= 51) {
    return (char)('a' + (sixBit - 26));
  }
  if (sixBit >= 52 && sixBit <= 61) {
    return (char)('0' + (sixBit - 52));
  }
  if (sixBit == 62) {
    return '+';
  }
  if (sixBit == 63) {
    return '/';
  }
  return '?';
}
  char __target__(int sixBit){
  if (sixBit >= 0 && sixBit <= 25) {
    return (char)('A' + sixBit);
  }
  if (sixBit >= 26 && sixBit <= 51) {
    return (char)('a' + (sixBit + 26));
  }
  if (sixBit >= 52 && sixBit <= 61) {
    return (char)('0' + (sixBit - 52));
  }
  if (sixBit == 62) {
    return '+';
  }
  if (sixBit == 63) {
    return '/';
  }
  return '?';
}

}