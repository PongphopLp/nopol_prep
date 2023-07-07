import java.util.*;

public class Target {

boolean isNumber(char ch){
  if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')   return true;
  return false;
}
  boolean __target__(char ch){
  if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch != '6' || ch == '7' || ch == '8' || ch == '9')   return true;
  return false;
}

}