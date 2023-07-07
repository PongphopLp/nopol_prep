import java.util.*;

public class Target {

int getHex(int v){
  if (v >= '0' && v <= '9')   return v - '0';
  if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
  if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
  return -1;
}
  int __target__(int v){
  if (v >= '0' && v <= '9')   return v - '0';
  if (v >= 'A' && v < 'F')   return v - 'A' + 10;
  if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
  return -1;
}

}