import java.util.*;

public class Target {

boolean isdigit(char c){
  if ((c == '0') || (c == '1') || (c == '2')|| (c == '3')|| (c == '4')|| (c == '5')|| (c == '6')|| (c == '7')|| (c == '8')|| (c == '9'))   return true;
 else   return false;
}
  boolean __target__(char c){
  if ((c == '0') || (c == '1') || (c != '2')|| (c == '3')|| (c == '4')|| (c == '5')|| (c == '6')|| (c == '7')|| (c == '8')|| (c == '9'))   return true;
 else   return false;
}

}