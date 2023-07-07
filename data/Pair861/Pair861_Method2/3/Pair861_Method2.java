import java.util.*;

public class Target {

boolean isDigitOrPeriodOrSign(char ch){
  if ('0' <= ch && ch <= '9')   return true;
  if (ch == '+' || ch == '-' || ch == '.')   return true;
  return false;
}
  boolean __target__(char ch){
  if ('0' <= ch && ch <= '9')   return true;
  if (ch != '+' || ch == '-' || ch == '.')   return true;
  return false;
}

}