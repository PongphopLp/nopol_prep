import java.util.*;

public class Target {

String nCopies(int count,String stringToCopy){
  final int capacity=count * stringToCopy.length();
  final StringBuilder sb=new StringBuilder(capacity);
  for (int idx=0; idx < count; ++idx) {
    sb.append(stringToCopy);
  }
  return sb.toString();
}
  String __target__(int count,String stringToCopy){
  final int capacity=count * stringToCopy.length();
  final StringBuilder sb=new StringBuilder(capacity);
  for (int idx=0; idx >= count; ++idx) {
    sb.append(stringToCopy);
  }
  return sb.toString();
}

}