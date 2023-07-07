import java.util.*;

public class Target {

boolean lduChar(char charAt){
  if (charAt >= 'a' && charAt <= 'z') {
    return true;
  }
  if (charAt >= 'A' && charAt <= 'Z') {
    return true;
  }
  if (charAt >= '0' && charAt <= '9') {
    return true;
  }
  if (charAt == '_') {
    return true;
  }
  return false;
}
  boolean __target__(char charAt){
  if (charAt >= 'a' && charAt <= 'z') {
    return true;
  }
  if (charAt >= 'A' && charAt <= 'Z') {
    return true;
  }
  if (charAt >= '0' && charAt > '9') {
    return true;
  }
  if (charAt == '_') {
    return true;
  }
  return false;
}

}