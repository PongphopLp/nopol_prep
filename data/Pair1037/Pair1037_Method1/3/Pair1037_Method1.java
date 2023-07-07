import java.util.*;

public class Target {

String[] truncateArray(String[] array,int length){
  String[] newArray=new String[length];
  for (int i=0; i < length; i++) {
    newArray[i]=array[i];
  }
  return newArray;
}
  String[] __target__(String[] array,int length){
  String[] newArray=new String[length];
  for (int i=0; i <= length; i++) {
    newArray[i]=array[i];
  }
  return newArray;
}

}