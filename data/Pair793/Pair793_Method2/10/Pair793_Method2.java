import java.util.*;

public class Target {

int comparaFechaBasica(GregorianCalendar comparada,GregorianCalendar fecha){
  int comparacion=0;
  int ano1=comparada.get(Calendar.YEAR);
  int mes1=comparada.get(Calendar.MONTH);
  int dia1=comparada.get(Calendar.DAY_OF_MONTH);
  int ano2=fecha.get(Calendar.YEAR);
  int mes2=fecha.get(Calendar.MONTH);
  int dia2=fecha.get(Calendar.DAY_OF_MONTH);
  if (ano1 == ano2) {
    if (mes1 == mes2) {
      if (dia1 == dia2) {
        comparacion=0;
      }
 else       if (dia1 < dia2) {
        comparacion=-1;
      }
 else       if (dia1 > dia2) {
        comparacion=1;
      }
    }
 else     if (mes1 < mes2) {
      comparacion=-1;
    }
 else     if (mes1 > mes2) {
      comparacion=1;
    }
  }
 else   if (ano1 < ano2) {
    comparacion=-1;
  }
 else   if (ano1 > ano2) {
    comparacion=1;
  }
  return comparacion;
}
  int __target__(GregorianCalendar comparada,GregorianCalendar fecha){
  int comparacion=0;
  int ano1=comparada.get(Calendar.YEAR);
  int mes1=comparada.get(Calendar.MONTH);
  int dia1=comparada.get(Calendar.DAY_OF_MONTH);
  int ano2=fecha.get(Calendar.YEAR);
  int mes2=fecha.get(Calendar.MONTH);
  int dia2=fecha.get(Calendar.DAY_OF_MONTH);
  if (ano1 != ano2) {
    if (mes1 == mes2) {
      if (dia1 == dia2) {
        comparacion=0;
      }
 else       if (dia1 < dia2) {
        comparacion=-1;
      }
 else       if (dia1 > dia2) {
        comparacion=1;
      }
    }
 else     if (mes1 < mes2) {
      comparacion=-1;
    }
 else     if (mes1 > mes2) {
      comparacion=1;
    }
  }
 else   if (ano1 < ano2) {
    comparacion=-1;
  }
 else   if (ano1 > ano2) {
    comparacion=1;
  }
  return comparacion;
}

}