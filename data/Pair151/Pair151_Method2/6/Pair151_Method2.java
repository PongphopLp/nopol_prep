import java.util.*;

public class Target {

boolean startsWith(byte[] string,byte[] start){
  if (string.length < start.length)   return false;
  for (int i=0; i < start.length; i++) {
    if (string[i] != start[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] string,byte[] start){
  if (string.length < start.length)   return false;
  for (int i=0; i < start.length; i--) {
    if (string[i] != start[i])     return false;
  }
  return true;
}

}