import java.util.*;

public class Target {

boolean verifieDimTableau(double[][] tableau){
  for (int i=1; i < tableau.length; i++) {
    if (tableau[0].length != tableau[i].length) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[][] tableau){
  for (int i=1; i >= tableau.length; i++) {
    if (tableau[0].length != tableau[i].length) {
      return false;
    }
  }
  return true;
}

}