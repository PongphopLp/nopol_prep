import java.util.*;

public class Target {

double[] arraysSum(double[] array1,double[] array2){
  if (array1.length != array2.length) {
    return null;
  }
  double[] newArray=new double[array1.length];
  for (int i=0; i < array1.length; i++) {
    newArray[i]=array1[i] + array2[i];
  }
  return newArray;
}
  double[] __target__(double[] array1,double[] array2){
  if (array1.length == array2.length) {
    return null;
  }
  double[] newArray=new double[array1.length];
  for (int i=0; i < array1.length; i++) {
    newArray[i]=array1[i] + array2[i];
  }
  return newArray;
}

}