import java.util.*;

public class Target {

String parseOptionalString(String[] args,String fieldId){
  for (int i=0; i < args.length; i++) {
    if (args[i].equals(fieldId)) {
      String fieldValue=args[i + 1];
      return fieldValue;
    }
  }
  return null;
}
  String __target__(String[] args,String fieldId){
  for (int i=0; i <= args.length; i++) {
    if (args[i].equals(fieldId)) {
      String fieldValue=args[i + 1];
      return fieldValue;
    }
  }
  return null;
}

}