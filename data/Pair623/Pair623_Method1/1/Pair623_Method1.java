import java.util.*;

public class Target {

boolean EsDeHoy(Date fecha){
  int año1=new Date().getYear();
  int mes1=new Date().getMonth();
  int dia1=new Date().getDay();
  int año2=fecha.getYear();
  int mes2=fecha.getMonth();
  int dia2=fecha.getDay();
  if (año1 == año2) {
    if (mes1 == mes2) {
      if (dia1 == dia2)       return true;
    }
  }
  return false;
}
  boolean __target__(Date fecha){
  int año1=new Date().getYear();
  int mes1=new Date().getMonth();
  int dia1=new Date().getDay();
  int año2=fecha.getYear();
  int mes2=fecha.getMonth();
  int dia2=fecha.getDay();
  if (año1 != año2) {
    if (mes1 == mes2) {
      if (dia1 == dia2)       return true;
    }
  }
  return false;
}

}