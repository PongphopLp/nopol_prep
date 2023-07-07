import java.util.*;

public class Target {

boolean equals(int[][] matrizA,int[][] matrizB){
  for (int i=0; i < matrizA.length; i++) {
    for (int j=0; j < matrizA[i].length; j++) {
      if (matrizA[i][j] != matrizB[i][j])       return false;
    }
  }
  return true;
}
  boolean __target__(int[][] matrizA,int[][] matrizB){
  for (int i=0; i < matrizA.length; i++) {
    for (int j=0; j < matrizA[i].length; j++) {
      if (matrizA[i][j] == matrizB[i][j])       return false;
    }
  }
  return true;
}

}