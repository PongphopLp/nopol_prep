import java.util.*;

public class Target {

int getHex(int c){
  if (c >= '0' && c <= '9')   return (c - '0');
 else   if (c >= 'A' && c <= 'F')   return (c - 'A' + 10);
 else   if (c >= 'a' && c <= 'f')   return (c - 'a' + 10);
 else   return -1;
}
  int __target__(int c){
  if (c >= '0' && c < '9')   return (c - '0');
 else   if (c >= 'A' && c <= 'F')   return (c - 'A' + 10);
 else   if (c >= 'a' && c <= 'f')   return (c - 'a' + 10);
 else   return -1;
}

}