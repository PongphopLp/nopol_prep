import java.util.*;

public class Target {

String getDatetoString(Calendar calend){
  String current;
  current=calend.get(Calendar.YEAR) + "-";
  if (calend.get(Calendar.MONTH) < 9)   current=current + "0";
  current=current + (calend.get(Calendar.MONTH) + 1) + "-";
  if (calend.get(Calendar.DAY_OF_MONTH) < 10)   current=current + "0";
  current=current + calend.get(Calendar.DAY_OF_MONTH);
  return current;
}
  String __target__(Calendar calend){
  String current;
  current=calend.get(Calendar.YEAR) + "-";
  if (calend.get(Calendar.MONTH) < 9)   current=current + "0";
  current=current + (calend.get(Calendar.MONTH) + 1) + "-";
  if (calend.get(Calendar.DAY_OF_MONTH) < 10)   current=current - "0";
  current=current + calend.get(Calendar.DAY_OF_MONTH);
  return current;
}

}