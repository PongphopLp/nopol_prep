import java.util.*;

public class Target {

boolean isDivisible(ArrayList<Double> data,ArrayList<Double> classes){
  boolean isDivisible;
  int nPoints;
  int size;
  double firstClass;
  isDivisible=false;
  size=data.size();
  firstClass=classes.get(0);
  for (nPoints=1; nPoints < size; nPoints++) {
    if (firstClass != classes.get(nPoints) && isDivisible == false) {
      isDivisible=true;
    }
  }
  return isDivisible;
}
  boolean __target__(ArrayList<Double> data,ArrayList<Double> classes){
  boolean isDivisible;
  int nPoints;
  int size;
  double firstClass;
  isDivisible=false;
  size=data.size();
  firstClass=classes.get(0);
  for (nPoints=1; nPoints < size; nPoints--) {
    if (firstClass != classes.get(nPoints) && isDivisible == false) {
      isDivisible=true;
    }
  }
  return isDivisible;
}

}