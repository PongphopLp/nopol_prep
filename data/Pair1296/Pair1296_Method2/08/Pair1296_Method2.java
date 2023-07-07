import java.util.*;

public class Target {

int str2hex(String str){
  int size=str.length();
  int hex=0;
  for (int i=0; i < size; ++i) {
    char c=str.charAt(i);
    if (c >= '0' && c <= '9')     hex=hex * 16 + (c - '0');
 else     if (c >= 'a' && c <= 'f')     hex=hex * 16 + 10 + (c - 'a');
 else     if (c >= 'A' && c <= 'F')     hex=hex * 16 + 10 + (c - 'A');
 else     break;
  }
  return hex;
}
  int __target__(String str){
  int size=str.length();
  int hex=0;
  for (int i=0; i < size; --i) {
    char c=str.charAt(i);
    if (c >= '0' && c <= '9')     hex=hex * 16 + (c - '0');
 else     if (c >= 'a' && c <= 'f')     hex=hex * 16 + 10 + (c - 'a');
 else     if (c >= 'A' && c <= 'F')     hex=hex * 16 + 10 + (c - 'A');
 else     break;
  }
  return hex;
}

}