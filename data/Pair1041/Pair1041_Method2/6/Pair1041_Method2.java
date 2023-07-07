import java.util.*;

public class Target {

String[] stripArgs(String[] originalArgs,int stripCount){
  if (originalArgs.length <= stripCount) {
    return new String[0];
  }
  String[] stripped=new String[originalArgs.length - stripCount];
  for (int i=0; i < stripped.length; i++) {
    stripped[i]=originalArgs[i + stripCount];
  }
  return stripped;
}
  String[] __target__(String[] originalArgs,int stripCount){
  if (originalArgs.length < stripCount) {
    return new String[0];
  }
  String[] stripped=new String[originalArgs.length - stripCount];
  for (int i=0; i < stripped.length; i++) {
    stripped[i]=originalArgs[i + stripCount];
  }
  return stripped;
}

}