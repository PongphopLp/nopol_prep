import java.util.*;

public class Target {

String[] removeIndexFromArray(String[] src,int index){
  if (index < 0 || index >= src.length)   return src;
  String[] newArr=new String[src.length - 1];
  int minus=0;
  for (int i=0; i < src.length; i++) {
    if (i == index)     minus=1;
 else     newArr[i - minus]=src[i];
  }
  return newArr;
}
  String[] __target__(String[] src,int index){
  if (index < 0 || index >= src.length)   return src;
  String[] newArr=new String[src.length - 1];
  int minus=0;
  for (int i=0; i < src.length; i++) {
    if (i == index)     minus=1;
 else     newArr[i + minus]=src[i];
  }
  return newArr;
}

}