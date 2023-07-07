import java.util.*;

public class Target {

int comparacionSimple(GregorianCalendar cal1,GregorianCalendar cal2){
  int mes1=cal1.get(GregorianCalendar.MONTH);
  int ano1=cal1.get(GregorianCalendar.YEAR);
  int dia1=cal1.get(GregorianCalendar.DAY_OF_MONTH);
  int mes2=cal2.get(GregorianCalendar.MONTH);
  int ano2=cal2.get(GregorianCalendar.YEAR);
  int dia2=cal2.get(GregorianCalendar.DAY_OF_MONTH);
  if (ano1 > ano2) {
    return 1;
  }
 else   if (ano2 > ano1) {
    return -1;
  }
 else   if (mes1 > mes2) {
    return 1;
  }
 else   if (mes2 > mes1) {
    return -1;
  }
 else   if (dia1 > dia2) {
    return 1;
  }
 else   if (dia2 > dia1) {
    return -1;
  }
 else {
    return 0;
  }
}
  int __target__(GregorianCalendar cal1,GregorianCalendar cal2){
  int mes1=cal1.get(GregorianCalendar.MONTH);
  int ano1=cal1.get(GregorianCalendar.YEAR);
  int dia1=cal1.get(GregorianCalendar.DAY_OF_MONTH);
  int mes2=cal2.get(GregorianCalendar.MONTH);
  int ano2=cal2.get(GregorianCalendar.YEAR);
  int dia2=cal2.get(GregorianCalendar.DAY_OF_MONTH);
  if (ano1 > ano2) {
    return 1;
  }
 else   if (ano2 > ano1) {
    return -1;
  }
 else   if (mes1 > mes2) {
    return 1;
  }
 else   if (mes2 > mes1) {
    return -1;
  }
 else   if (dia1 <= dia2) {
    return 1;
  }
 else   if (dia2 > dia1) {
    return -1;
  }
 else {
    return 0;
  }
}

}