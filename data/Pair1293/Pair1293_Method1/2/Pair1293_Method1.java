import java.util.*;

public class Target {

boolean isInRange(Date ponto,Date inicio,Date fim){
  if (inicio.compareTo(ponto) <= 0 && fim.compareTo(ponto) >= 0) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(Date ponto,Date inicio,Date fim){
  if (inicio.compareTo(ponto) <= 0 && fim.compareTo(ponto) < 0) {
    return true;
  }
 else {
    return false;
  }
}

}