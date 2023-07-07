import java.util.*;

public class Target {

boolean isAsciiAlnum(char c){
  if ('a' <= c && c <= 'z')   return true;
  if ('A' <= c && c <= 'Z')   return true;
  if ('0' <= c && c <= '9')   return true;
  return false;
}
  boolean __target__(char c){
  if ('a' <= c && c <= 'z')   return true;
  if ('A' <= c && c <= 'Z')   return true;
  if ('0' < c && c <= '9')   return true;
  return false;
}

}