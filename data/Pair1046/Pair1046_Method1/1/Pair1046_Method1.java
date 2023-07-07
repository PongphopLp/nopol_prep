import java.util.*;

public class Target {

String[] removeLinesFromBeginning(String[] lines,int amountToRemove){
  String[] result=new String[lines.length - amountToRemove];
  for (int i=0; i < result.length; i++) {
    result[i]=lines[i + amountToRemove];
  }
  return result;
}
  String[] __target__(String[] lines,int amountToRemove){
  String[] result=new String[lines.length - amountToRemove];
  for (int i=0; i < result.length; i--) {
    result[i]=lines[i + amountToRemove];
  }
  return result;
}

}