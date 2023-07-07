import java.util.*;

public class Target {

double mean(ArrayList<Double> arr){
  double total=0;
  double size=(double)arr.size();
  double mean;
  for (int i=0; i < arr.size(); i++) {
    total+=arr.get(i);
  }
  mean=total / size;
  return (mean);
}
  double __target__(ArrayList<Double> arr){
  double total=0;
  double size=(double)arr.size();
  double mean;
  for (int i=0; i < arr.size(); i--) {
    total+=arr.get(i);
  }
  mean=total / size;
  return (mean);
}

}