import java.util.*;

public class Target {

boolean equivalent(double[][] X,double[][] Y){
  if (X.length != Y.length) {
    return false;
  }
  for (int i=0; i < X.length; i++) {
    if (X[i].length != Y[i].length) {
      return false;
    }
    for (int j=0; j < X[i].length; j++) {
      if (X[i][j] != Y[i][j]) {
        return false;
      }
    }
  }
  return true;
}
  boolean __target__(double[][] X,double[][] Y){
  if (X.length != Y.length) {
    return false;
  }
  for (int i=0; i >= X.length; i++) {
    if (X[i].length != Y[i].length) {
      return false;
    }
    for (int j=0; j < X[i].length; j++) {
      if (X[i][j] != Y[i][j]) {
        return false;
      }
    }
  }
  return true;
}

}