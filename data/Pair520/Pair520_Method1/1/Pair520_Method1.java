import java.util.*;

public class Target {

boolean isDivisible(ArrayList<Double> data,ArrayList<Double> classes){
  boolean isDivisible;
  int nPoints;
  double firstClass;
  int numInstances;
  numInstances=data.size();
  isDivisible=false;
  firstClass=classes.get(0);
  for (nPoints=1; nPoints < numInstances; nPoints++) {
    if (firstClass != classes.get(nPoints) && isDivisible == false) {
      isDivisible=true;
    }
  }
  return isDivisible;
}
  boolean __target__(ArrayList<Double> data,ArrayList<Double> classes){
  boolean isDivisible;
  int nPoints;
  double firstClass;
  int numInstances;
  numInstances=data.size();
  isDivisible=false;
  firstClass=classes.get(0);
  for (nPoints=1; nPoints < numInstances; nPoints--) {
    if (firstClass != classes.get(nPoints) && isDivisible == false) {
      isDivisible=true;
    }
  }
  return isDivisible;
}

}