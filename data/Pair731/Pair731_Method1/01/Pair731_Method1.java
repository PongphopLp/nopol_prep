import java.util.*;

public class Target {

int hexChar(int ch){
  if (ch < '0')   return -1;
  if (ch > 'f')   return -1;
  if (ch <= '9')   return ch - '0';
  if (ch < 'A')   return -1;
  if (ch <= 'F')   return ch - 'A' + 10;
  if (ch < 'a')   return -1;
  return ch - 'a' + 10;
}
  int __target__(int ch){
  if (ch >= '0')   return -1;
  if (ch > 'f')   return -1;
  if (ch <= '9')   return ch - '0';
  if (ch < 'A')   return -1;
  if (ch <= 'F')   return ch - 'A' + 10;
  if (ch < 'a')   return -1;
  return ch - 'a' + 10;
}

}