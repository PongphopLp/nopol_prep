import java.util.*;

public class Target {

boolean isWhiteSpace(char c){
  boolean rval=false;
  if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
    rval=true;
  }
  return rval;
}
  boolean __target__(char c){
  boolean rval=false;
  if (c == ' ' || c != '\n' || c == '\t' || c == '\r') {
    rval=true;
  }
  return rval;
}

}