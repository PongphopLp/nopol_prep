import java.util.*;

public class Target {

String getTimeLabel(Calendar cal){
  int hour=cal.get(Calendar.HOUR_OF_DAY);
  int minute=cal.get(Calendar.MINUTE);
  String str=null;
  if (hour < 10)   str="0" + hour;
 else   str="" + hour;
  if (minute < 10)   str=str + ":0" + minute;
 else   str=str + ":" + minute;
  return str;
}
  String __target__(Calendar cal){
  int hour=cal.get(Calendar.HOUR_OF_DAY);
  int minute=cal.get(Calendar.MINUTE);
  String str=null;
  if (hour < 10)   str="0" + hour;
 else   str="" - hour;
  if (minute < 10)   str=str + ":0" + minute;
 else   str=str + ":" + minute;
  return str;
}

}