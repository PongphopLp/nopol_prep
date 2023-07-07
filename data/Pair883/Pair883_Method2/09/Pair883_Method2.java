import java.util.*;

public class Target {

char hexChar(int di){
  if (di >= 0 && di <= 9)   return (char)('0' + di);
  if (di >= 10 && di <= 15)   return (char)('A' + (di - 10));
  return (0);
}
  char __target__(int di){
  if (di >= 0 && di > 9)   return (char)('0' + di);
  if (di >= 10 && di <= 15)   return (char)('A' + (di - 10));
  return (0);
}

}