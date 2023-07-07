import java.util.*;

public class Target {

boolean esBisiesto(int ano){
  boolean bisiesto;
  if (ano % 4 != 0) {
    bisiesto=false;
  }
 else   if (ano % 400 == 0) {
    bisiesto=true;
  }
 else   if (ano % 100 == 0) {
    bisiesto=false;
  }
 else {
    bisiesto=true;
  }
  return bisiesto;
}
  boolean __target__(int ano){
  boolean bisiesto;
  if (ano % 4 != 0) {
    bisiesto=false;
  }
 else   if (ano % 400 != 0) {
    bisiesto=true;
  }
 else   if (ano % 100 == 0) {
    bisiesto=false;
  }
 else {
    bisiesto=true;
  }
  return bisiesto;
}

}