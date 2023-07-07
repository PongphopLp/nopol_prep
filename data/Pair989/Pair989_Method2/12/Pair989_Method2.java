import java.util.*;

public class Target {

boolean charValid(char c){
  if (((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F')))   return true;
  return false;
}
  boolean __target__(char c){
  if (((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c < 'F')))   return true;
  return false;
}

}