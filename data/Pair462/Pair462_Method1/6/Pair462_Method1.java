import java.util.*;

public class Target {

boolean doomsdayLeapYear(int year){
  final int modFour=year & 0x0003, modHundred=year % 100;
  if (((0 == modFour) && (modHundred != 0)) || ((0 == modHundred) && (0 == (modHundred & 0x0003))))   return true;
 else   return false;
}
  boolean __target__(int year){
  final int modFour=year & 0x0003, modHundred=year % 100;
  if (((0 == modFour) && (modHundred != 0)) || ((0 != modHundred) && (0 == (modHundred & 0x0003))))   return true;
 else   return false;
}

}