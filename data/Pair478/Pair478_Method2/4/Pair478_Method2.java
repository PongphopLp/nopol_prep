import java.util.*;

public class Target {

boolean IsSpace(int c){
  if (c == ' ' || c == '\t' || c == '\r' || c == '\n')   return true;
  return false;
}
  boolean __target__(int c){
  if (c == ' ' || c == '\t' || c == '\r' || c != '\n')   return true;
  return false;
}

}