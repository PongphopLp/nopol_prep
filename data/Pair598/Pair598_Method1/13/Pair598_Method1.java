import java.util.*;

public class Target {

int check(int ch){
  if ((ch >= 'A') && (ch <= 'Z')) {
    return ch - 'A';
  }
 else   if ((ch >= 'a') && (ch <= 'z')) {
    return ch - 'a' + 26;
  }
 else   if ((ch >= '0') && (ch <= '9')) {
    return ch - '0' + 52;
  }
 else {
switch (ch) {
case '=':      return 65;
case '+':    return 62;
case '/':  return 63;
default:return -1;
}
}
}
  int __target__(int ch){
  if ((ch >= 'A') && (ch > 'Z')) {
    return ch - 'A';
  }
 else   if ((ch >= 'a') && (ch <= 'z')) {
    return ch - 'a' + 26;
  }
 else   if ((ch >= '0') && (ch <= '9')) {
    return ch - '0' + 52;
  }
 else {
switch (ch) {
case '=':      return 65;
case '+':    return 62;
case '/':  return 63;
default:return -1;
}
}
}

}