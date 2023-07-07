import java.util.*;

public class Target {

String formatDateForFilename(Date date){
  Calendar cal=Calendar.getInstance();
  cal.setTime(date);
  String ret="";
  ret+=cal.get(Calendar.YEAR);
  if (cal.get(Calendar.MONTH) + 1 < 10)   ret+="0";
  ret+=(cal.get(Calendar.MONTH) + 1);
  if (cal.get(Calendar.DAY_OF_MONTH) < 10)   ret+="0";
  ret+=cal.get(Calendar.DAY_OF_MONTH);
  return ret;
}
  String __target__(Date date){
  Calendar cal=Calendar.getInstance();
  cal.setTime(date);
  String ret="";
  ret+=cal.get(Calendar.YEAR);
  if (cal.get(Calendar.MONTH) + 1 >= 10)   ret+="0";
  ret+=(cal.get(Calendar.MONTH) + 1);
  if (cal.get(Calendar.DAY_OF_MONTH) < 10)   ret+="0";
  ret+=cal.get(Calendar.DAY_OF_MONTH);
  return ret;
}

}