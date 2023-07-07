import java.util.*;

public class Target {

String[] removeArrayItem(String[] fromArray,int index){
  String[] result=new String[fromArray.length - 1];
  int to, from;
  for (to=0, from=0; from < fromArray.length; from++)   if (from != index) {
    result[to]=fromArray[from];
    to++;
  }
  ;
  return result;
}
  String[] __target__(String[] fromArray,int index){
  String[] result=new String[fromArray.length - 1];
  int to, from;
  for (to=0, from=0; from < fromArray.length; from++)   if (from != index) {
    result[to]=fromArray[from];
    to--;
  }
  ;
  return result;
}

}