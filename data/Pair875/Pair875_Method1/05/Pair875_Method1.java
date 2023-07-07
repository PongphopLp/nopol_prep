import java.util.*;

public class Target {

char encodeSixBits(int b){
  char c;
  if (b <= 25) {
    c=(char)('A' + b);
  }
 else   if (b <= 51) {
    c=(char)('a' + b - 26);
  }
 else   if (b <= 61) {
    c=(char)('0' + b - 52);
  }
 else   if (b == 62) {
    c='+';
  }
 else {
    c='/';
  }
  return c;
}
  char __target__(int b){
  char c;
  if (b <= 25) {
    c=(char)('A' + b);
  }
 else   if (b <= 51) {
    c=(char)('a' + b + 26);
  }
 else   if (b <= 61) {
    c=(char)('0' + b - 52);
  }
 else   if (b == 62) {
    c='+';
  }
 else {
    c='/';
  }
  return c;
}

}