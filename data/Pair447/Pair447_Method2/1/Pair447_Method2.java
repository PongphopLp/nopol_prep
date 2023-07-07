import java.util.*;

public class Target {

boolean isLeapYear(int y){
  if (y % 100 == 0)   return (y % 400 == 0);
 else   return (y % 4 == 0);
}
  boolean __target__(int y){
  if (y % 100 != 0)   return (y % 400 == 0);
 else   return (y % 4 == 0);
}

}