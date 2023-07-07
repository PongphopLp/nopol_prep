import java.util.*;

public class Target {

double mean(double[] v,int e){
  double total=0;
  for (int i=0; i < e; i++) {
    total+=v[i];
  }
  return total / e;
}
  double __target__(double[] v,int e){
  double total=0;
  for (int i=0; i <= e; i++) {
    total+=v[i];
  }
  return total / e;
}

}