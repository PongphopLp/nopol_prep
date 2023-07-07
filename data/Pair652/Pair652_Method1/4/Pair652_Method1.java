import java.util.*;

public class Target {

double sumProdDiff(double[] x,double[] y,double mx,double my){
  double tot=0.0;
  for (int i=0; i < x.length; i++)   tot+=(x[i] - mx) * (y[i] - my);
  return tot;
}
  double __target__(double[] x,double[] y,double mx,double my){
  double tot=0.0;
  for (int i=0; i < x.length; i++)   tot+=(x[i] - mx) * (y[i] + my);
  return tot;
}

}