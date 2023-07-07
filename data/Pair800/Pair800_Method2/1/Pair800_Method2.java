import java.util.*;

public class Target {

boolean isEntreLosRangos(int rangoInicial,int rangoFinal,String text){
  if (text.length() >= rangoInicial && text.length() <= rangoFinal) {
    return true;
  }
  return false;
}
  boolean __target__(int rangoInicial,int rangoFinal,String text){
  if (text.length() < rangoInicial && text.length() <= rangoFinal) {
    return true;
  }
  return false;
}

}