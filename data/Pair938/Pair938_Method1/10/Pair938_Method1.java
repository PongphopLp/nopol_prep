import java.util.*;

public class Target {

int xDigitToInt(int c){
  if ('0' <= c && c <= '9')   return c - '0';
 else   if ('a' <= c && c <= 'f')   return c - ('a' - 10);
 else   if ('A' <= c && c <= 'F')   return c - ('A' - 10);
 else   return -1;
}
  int __target__(int c){
  if ('0' <= c && c <= '9')   return c - '0';
 else   if ('a' <= c && c <= 'f')   return c - ('a' + 10);
 else   if ('A' <= c && c <= 'F')   return c - ('A' - 10);
 else   return -1;
}

}