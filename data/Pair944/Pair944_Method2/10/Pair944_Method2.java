import java.util.*;

public class Target {

int getAnoDiferencia(Date FechaInicio,Date FechaFin){
  int difAnos=0;
  Calendar calFechaFin=Calendar.getInstance();
  Calendar calFechaInicio=Calendar.getInstance();
  calFechaFin.setTime(FechaFin);
  calFechaInicio.setTime(FechaInicio);
  int anosInicio=calFechaInicio.get(Calendar.YEAR);
  int anosFin=calFechaFin.get(Calendar.YEAR);
  difAnos=anosFin - anosInicio;
  int mesInicio=calFechaInicio.get(Calendar.MONTH);
  int mesFin=calFechaFin.get(Calendar.MONTH);
  int difMeses=mesFin - mesInicio;
  int diaInicio=calFechaInicio.get(Calendar.DATE);
  int diaFin=calFechaFin.get(Calendar.DATE);
  int difDias=diaFin - diaInicio;
  if ((difMeses < 0) || (difMeses == 0 && difDias < 0)) {
    difAnos--;
  }
  return difAnos;
}
  int __target__(Date FechaInicio,Date FechaFin){
  int difAnos=0;
  Calendar calFechaFin=Calendar.getInstance();
  Calendar calFechaInicio=Calendar.getInstance();
  calFechaFin.setTime(FechaFin);
  calFechaInicio.setTime(FechaInicio);
  int anosInicio=calFechaInicio.get(Calendar.YEAR);
  int anosFin=calFechaFin.get(Calendar.YEAR);
  difAnos=anosFin - anosInicio;
  int mesInicio=calFechaInicio.get(Calendar.MONTH);
  int mesFin=calFechaFin.get(Calendar.MONTH);
  int difMeses=mesFin - mesInicio;
  int diaInicio=calFechaInicio.get(Calendar.DATE);
  int diaFin=calFechaFin.get(Calendar.DATE);
  int difDias=diaFin - diaInicio;
  if ((difMeses <= 0) || (difMeses == 0 && difDias < 0)) {
    difAnos--;
  }
  return difAnos;
}

}