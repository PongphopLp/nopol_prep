import java.util.*;

public class Target {

double[] removeAt(double[] array,int index){
  if (array == null) {
    return null;
  }
  if (index < 0 || index >= array.length) {
    return array;
  }
  double[] retVal=new double[array.length - 1];
  for (int i=0; i < array.length; i++) {
    if (i < index) {
      retVal[i]=array[i];
    }
 else     if (i > index) {
      retVal[i - 1]=array[i];
    }
  }
  return retVal;
}
  double[] __target__(double[] array,int index){
  if (array == null) {
    return null;
  }
  if (index < 0 || index >= array.length) {
    return array;
  }
  double[] retVal=new double[array.length - 1];
  for (int i=0; i >= array.length; i++) {
    if (i < index) {
      retVal[i]=array[i];
    }
 else     if (i > index) {
      retVal[i - 1]=array[i];
    }
  }
  return retVal;
}

}