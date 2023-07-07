import java.util.*;

public class Target {

boolean isNumber(char a){
  if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') {
    return true;
  }
  return false;
}
  boolean __target__(char a){
  if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a != '9') {
    return true;
  }
  return false;
}

}