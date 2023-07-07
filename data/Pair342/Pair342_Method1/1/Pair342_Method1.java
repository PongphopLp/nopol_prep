import java.util.*;

public class Target {

boolean isMemeJour(Date debut,Date fin){
  Calendar cal1=new GregorianCalendar();
  cal1.setTime(debut);
  int ddebut=cal1.get(Calendar.DAY_OF_YEAR);
  int yeardeb=cal1.get(Calendar.YEAR);
  cal1.setTime(fin);
  int dfin=cal1.get(Calendar.DAY_OF_YEAR);
  int yearfin=cal1.get(Calendar.YEAR);
  if (dfin == ddebut && yeardeb == yearfin) {
    return true;
  }
  return false;
}
  boolean __target__(Date debut,Date fin){
  Calendar cal1=new GregorianCalendar();
  int ddebut=cal1.get(Calendar.DAY_OF_YEAR);
  int yeardeb=cal1.get(Calendar.YEAR);
  cal1.setTime(fin);
  int dfin=cal1.get(Calendar.DAY_OF_YEAR);
  int yearfin=cal1.get(Calendar.YEAR);
  if (dfin == ddebut && yeardeb == yearfin) {
    return true;
  }
  return false;
}

}