import java.util.*;

public class Target {

boolean isFirstNumberChar(char x){
  if (x == '.')   return (true);
  if (x == '+')   return (true);
  if (x == '-')   return (true);
  if ((x >= '0') && (x <= '9'))   return (true);
  return (false);
}
  boolean __target__(char x){
  if (x == '.')   return (true);
  if (x == '+')   return (true);
  if (x == '-')   return (true);
  if ((x >= '0') && (x > '9'))   return (true);
  return (false);
}

}