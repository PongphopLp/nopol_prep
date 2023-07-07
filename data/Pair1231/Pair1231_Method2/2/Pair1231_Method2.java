import java.util.*;

public class Target {

String intToStr(int num){
  if (num > -1 && num < 10)   return ("0" + (new Integer(num).toString()));
 else   return (new Integer(num).toString());
}
  String __target__(int num){
  if (num <= -1 && num < 10)   return ("0" + (new Integer(num).toString()));
 else   return (new Integer(num).toString());
}

}