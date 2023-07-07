import java.util.*;

public class Target {

boolean isBissextile(int year){
  boolean flag=false;
  if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    flag=true;
  }
  return flag;
}
  boolean __target__(int year){
  boolean flag=false;
  if ((year % 400 == 0) || ((year % 4 == 0) && (year * 100 != 0))) {
    flag=true;
  }
  return flag;
}

}