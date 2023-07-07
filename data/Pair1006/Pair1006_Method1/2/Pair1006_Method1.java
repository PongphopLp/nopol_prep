import java.util.*;

public class Target {

String getDayString(Calendar cal){
  if (cal.get(Calendar.DATE) < 10)   return "0" + Integer.toString(cal.get(Calendar.DATE));
 else   return Integer.toString(cal.get(Calendar.DATE));
}
  String __target__(Calendar cal){
  if (cal.get(Calendar.DATE) <= 10)   return "0" + Integer.toString(cal.get(Calendar.DATE));
 else   return Integer.toString(cal.get(Calendar.DATE));
}

}