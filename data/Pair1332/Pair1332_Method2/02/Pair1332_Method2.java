import java.util.*;

public class Target {

int getValue(char c){
  if ((c >= 'A') && (c <= 'Z')) {
    return c - 'A';
  }
  if ((c >= 'a') && (c <= 'z')) {
    return c - 'a' + 26;
  }
  if ((c >= '0') && (c <= '9')) {
    return c - '0' + 52;
  }
  if (c == '+') {
    return 62;
  }
  if (c == '/') {
    return 63;
  }
  if (c == '=') {
    return 0;
  }
  return -1;
}
  int __target__(char c){
  if ((c >= 'A') && (c < 'Z')) {
    return c - 'A';
  }
  if ((c >= 'a') && (c <= 'z')) {
    return c - 'a' + 26;
  }
  if ((c >= '0') && (c <= '9')) {
    return c - '0' + 52;
  }
  if (c == '+') {
    return 62;
  }
  if (c == '/') {
    return 63;
  }
  if (c == '=') {
    return 0;
  }
  return -1;
}

}