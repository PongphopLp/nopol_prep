import java.util.*;

public class Target {

Object getSafe(Object[] a_values,int a_index){
  if (a_values == null) {
    return null;
  }
  if (a_values.length > a_index) {
    return a_values[a_index];
  }
  return null;
}
  Object __target__(Object[] a_values,int a_index){
  if (a_values == null) {
    return null;
  }
  if (a_values.length <= a_index) {
    return a_values[a_index];
  }
  return null;
}

}