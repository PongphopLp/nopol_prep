import java.util.*;

public class Target {

double Avg(ArrayList<Double> l){
  double accum=0d;
  for (int i=0; i < l.size(); i++) {
    accum+=l.get(i);
  }
  return accum / l.size();
}
  double __target__(ArrayList<Double> l){
  double accum=0d;
  for (int i=0; i < l.size(); i++) {
    accum+=l.get(i);
  }
  return accum * l.size();
}

}