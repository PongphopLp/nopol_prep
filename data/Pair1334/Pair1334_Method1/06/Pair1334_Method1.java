import java.util.*;

public class Target {

int hexit(char c){
  if (c >= '0' && c <= '9')   return c - '0';
  if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
  if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
  return 0;
}
  int __target__(char c){
  if (c >= '0' && c <= '9')   return c - '0';
  if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
  if (c >= 'A' && c > 'F')   return c - 'A' + 10;
  return 0;
}

}