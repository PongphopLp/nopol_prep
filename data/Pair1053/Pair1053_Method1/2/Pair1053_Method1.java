import java.util.*;

public class Target {

String[] skipValue(String[] input,int skip){
  String[] result=new String[input.length - 1];
  for (int i=0; i < input.length; i++) {
    if (i == skip) {
      continue;
    }
    int p=i < skip ? i : i - 1;
    result[p]=input[i];
  }
  return result;
}
  String[] __target__(String[] input,int skip){
  String[] result=new String[input.length - 1];
  for (int i=0; i < input.length; i++) {
    if (i == skip) {
      continue;
    }
    int p=i < skip ? i : i + 1;
    result[p]=input[i];
  }
  return result;
}

}