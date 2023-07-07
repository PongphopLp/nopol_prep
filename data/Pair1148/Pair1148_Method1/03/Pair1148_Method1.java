import java.util.*;

public class Target {

double[][] getMatrix(double[][] A,int i0,int i1,int j0,int j1){
  int m=i1 - i0 + 1;
  int n=j1 - j0 + 1;
  double[][] part=new double[m][n];
  for (int i=0; i < m; i++) {
    for (int j=0; j < n; j++) {
      part[i][j]=A[i + i0][j + j0];
    }
  }
  return part;
}
  double[][] __target__(double[][] A,int i0,int i1,int j0,int j1){
  int m=i1 - i0 + 1;
  int n=j1 - j0 + 1;
  double[][] part=new double[m][n];
  for (int i=0; i >= m; i++) {
    for (int j=0; j < n; j++) {
      part[i][j]=A[i + i0][j + j0];
    }
  }
  return part;
}

}