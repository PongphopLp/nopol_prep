import java.util.*;

public class Target {

long stringToLong(String s){
  long l=0L;
  int i=0;
  GetTheLong:   while (true) {
    if (i < s.length() && i < 12) {
      char c=s.charAt(i);
      l*=37L;
      if (c >= 'A' && c <= 'Z') {
        l+=(1 + c) - 65;
      }
 else       if (c >= 'a' && c <= 'z') {
        l+=(1 + c) - 97;
      }
 else       if (c >= '0' && c <= '9') {
        l+=(27 + c) - 48;
      }
      i++;
    }
 else {
      break GetTheLong;
    }
  }
  ENDLESS:   while (true) {
    if (l % 37L == 0L && l != 0L) {
      l/=37L;
    }
 else {
      break ENDLESS;
    }
  }
  return l;
}
  long __target__(String s){
  long l=0L;
  int i=0;
  GetTheLong:   while (true) {
    if (i < s.length() && i < 12) {
      char c=s.charAt(i);
      l*=37L;
      if (c >= 'A' && c <= 'Z') {
        l+=(1 + c) - 65;
      }
 else       if (c >= 'a' && c <= 'z') {
        l+=(1 + c) - 97;
      }
 else       if (c > '0' && c <= '9') {
        l+=(27 + c) - 48;
      }
      i++;
    }
 else {
      break GetTheLong;
    }
  }
  ENDLESS:   while (true) {
    if (l % 37L == 0L && l != 0L) {
      l/=37L;
    }
 else {
      break ENDLESS;
    }
  }
  return l;
}

}