import java.util.*;

public class Target {

boolean equalarrays(int[][] one,int[][] two){
  for (int i=0; i < one.length; i++) {
    for (int j=0; j < one[i].length; j++) {
      if (!(one[i][j] == two[i][j])) {
        return false;
      }
    }
  }
  return true;
}
  boolean __target__(int[][] one,int[][] two){
  for (int i=0; i < one.length; i++) {
    for (int j=0; j <= one[i].length; j++) {
      if (!(one[i][j] == two[i][j])) {
        return false;
      }
    }
  }
  return true;
}

}