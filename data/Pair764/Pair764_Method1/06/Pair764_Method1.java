import java.util.*;

public class Target {

String getDateKey(Date date){
  StringBuffer value=new StringBuffer();
  Calendar calendar=Calendar.getInstance();
  long l;
  calendar.setTime(date);
  value.append(calendar.get(Calendar.YEAR));
  l=calendar.get(Calendar.MONTH) + 1;
  if (l < 10) {
    value.append("0");
  }
  value.append(l);
  l=calendar.get(Calendar.DAY_OF_MONTH);
  if (l < 10) {
    value.append("0");
  }
  value.append(l);
  return value.toString();
}
  String __target__(Date date){
  StringBuffer value=new StringBuffer();
  Calendar calendar=Calendar.getInstance();
  long l;
  value.append(calendar.get(Calendar.YEAR));
  l=calendar.get(Calendar.MONTH) + 1;
  if (l < 10) {
    value.append("0");
  }
  value.append(l);
  l=calendar.get(Calendar.DAY_OF_MONTH);
  if (l < 10) {
    value.append("0");
  }
  value.append(l);
  return value.toString();
}

}