import java.util.*;

public class Target {

int getValue(char c){
  if (c >= 'A' && c <= 'Z') {
    return c - 65;
  }
  if (c >= 'a' && c <= 'z') {
    return (c - 97) + 26;
  }
  if (c >= '0' && c <= '9') {
    return (c - 48) + 52;
  }
  if (c == '+') {
    return 62;
  }
  if (c == '/') {
    return 63;
  }
  return c != '=' ? -1 : 0;
}
  int __target__(char c){
  if (c >= 'A' && c <= 'Z') {
    return c - 65;
  }
  if (c >= 'a' && c <= 'z') {
    return (c - 97) + 26;
  }
  if (c >= '0' && c <= '9') {
    return (c - 48) + 52;
  }
  if (c == '+') {
    return 62;
  }
  if (c == '/') {
    return 63;
  }
  return c == '=' ? -1 : 0;
}

}