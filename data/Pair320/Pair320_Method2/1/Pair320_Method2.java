import java.util.*;

public class Target {

boolean arraysIguais(String[] termos1,String[] termos2){
  if (termos1.length != termos2.length) {
    return false;
  }
  for (int i=0; i < termos1.length; i++) {
    if (!termos1[i].equals(termos2[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(String[] termos1,String[] termos2){
  if (termos1.length == termos2.length) {
    return false;
  }
  for (int i=0; i < termos1.length; i++) {
    if (!termos1[i].equals(termos2[i])) {
      return false;
    }
  }
  return true;
}

}