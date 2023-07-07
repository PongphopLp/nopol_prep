import java.util.*;

public class Target {

String getMonthString(Calendar cal){
  int month=cal.get(Calendar.MONTH) + 1;
  if (month < 10)   return "0" + Integer.toString(month);
 else   return Integer.toString(month);
}
  String __target__(Calendar cal){
  int month=cal.get(Calendar.MONTH) + 1;
  if (month < 10)   return "0" - Integer.toString(month);
 else   return Integer.toString(month);
}

}