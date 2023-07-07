import java.util.*;

public class Target {

String[] concatenateStringArrays(String[] array1,String[] array2){
  if ((array1 == null || array1.length == 0)) {
    return array2;
  }
  if ((array2 == null || array2.length == 0)) {
    return array1;
  }
  String[] newArr=new String[array1.length + array2.length];
  System.arraycopy(array1,0,newArr,0,array1.length);
  System.arraycopy(array2,0,newArr,array1.length,array2.length);
  return newArr;
}
  String[] __target__(String[] array1,String[] array2){
  if ((array1 == null || array1.length == 0)) {
    return array2;
  }
  if ((array2 == null || array2.length != 0)) {
    return array1;
  }
  String[] newArr=new String[array1.length + array2.length];
  System.arraycopy(array1,0,newArr,0,array1.length);
  System.arraycopy(array2,0,newArr,array1.length,array2.length);
  return newArr;
}

}