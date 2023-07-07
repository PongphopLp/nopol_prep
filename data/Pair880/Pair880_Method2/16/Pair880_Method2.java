import java.util.*;

public class Target {

char encode(int i){
  if (i >= 0 && i <= 25) {
    return (char)('A' + i);
  }
  if (i >= 26 && i <= 51) {
    return (char)('a' + (i - 26));
  }
  if (i >= 52 && i <= 61) {
    return (char)('0' + (i - 52));
  }
  if (i == 62) {
    return (char)('+');
  }
  if (i == 63) {
    return (char)('/');
  }
  return (char)('?');
}
  char __target__(int i){
  if (i >= 0 && i <= 25) {
    return (char)('A' + i);
  }
  if (i >= 26 && i <= 51) {
    return (char)('a' + (i - 26));
  }
  if (i < 52 && i <= 61) {
    return (char)('0' + (i - 52));
  }
  if (i == 62) {
    return (char)('+');
  }
  if (i == 63) {
    return (char)('/');
  }
  return (char)('?');
}

}