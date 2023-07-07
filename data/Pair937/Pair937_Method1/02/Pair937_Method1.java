import java.util.*;

public class Target {

boolean identc(char c){
  if (c >= 'a' && c <= 'z')   return true;
  if (c >= 'A' && c <= 'Z')   return true;
  if (c >= '0' && c <= '9')   return true;
  return c == '_';
}
  boolean __target__(char c){
  if (c >= 'a' && c < 'z')   return true;
  if (c >= 'A' && c <= 'Z')   return true;
  if (c >= '0' && c <= '9')   return true;
  return c == '_';
}

}