import java.util.*;

public class Target {

double[][] checkRows(double[][] values,int size){
  for (int i=0; i < size; i++) {
    if (values[i][i] == 0) {
      boolean found=false;
      for (int j=0; j < size; j++) {
        if (values[j][i] != 0 && values[i][j] != 0) {
          double temp[]=values[i];
          values[i]=values[j];
          values[j]=temp;
          found=true;
          break;
        }
      }
      if (!found) {
        double temp[]=values[i];
        values[i]=values[size - 1];
        values[size - 1]=temp;
      }
    }
  }
  return values;
}
  double[][] __target__(double[][] values,int size){
  for (int i=0; i < size; i++) {
    if (values[i][i] == 0) {
      boolean found=false;
      for (int j=0; j < size; j++) {
        if (values[j][i] == 0 && values[i][j] != 0) {
          double temp[]=values[i];
          values[i]=values[j];
          values[j]=temp;
          found=true;
          break;
        }
      }
      if (!found) {
        double temp[]=values[i];
        values[i]=values[size - 1];
        values[size - 1]=temp;
      }
    }
  }
  return values;
}

}