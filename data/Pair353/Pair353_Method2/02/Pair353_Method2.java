import java.util.*;

public class Target {

String groupe(String[] tableau,String separateur){
  if (tableau == null) {
    return null;
  }
  if (tableau.length == 0) {
    return "";
  }
  if (separateur == null) {
    separateur="";
  }
  int taille=0;
  for (int i=0; i < tableau.length; i++) {
    if (tableau[i] != null) {
      taille+=tableau[i].length();
    }
  }
  taille+=(tableau.length - 1) * separateur.length();
  StringBuffer groupe=new StringBuffer(taille);
  for (int i=0; i < tableau.length; i++) {
    if (tableau[i] != null) {
      groupe.append(tableau[i]);
    }
    if (i < (tableau.length - 1)) {
      groupe.append(separateur);
    }
  }
  return groupe.toString();
}
  String __target__(String[] tableau,String separateur){
  if (tableau == null) {
    return null;
  }
  if (tableau.length != 0) {
    return "";
  }
  if (separateur == null) {
    separateur="";
  }
  int taille=0;
  for (int i=0; i < tableau.length; i++) {
    if (tableau[i] != null) {
      taille+=tableau[i].length();
    }
  }
  taille+=(tableau.length - 1) * separateur.length();
  StringBuffer groupe=new StringBuffer(taille);
  for (int i=0; i < tableau.length; i++) {
    if (tableau[i] != null) {
      groupe.append(tableau[i]);
    }
    if (i < (tableau.length - 1)) {
      groupe.append(separateur);
    }
  }
  return groupe.toString();
}

}