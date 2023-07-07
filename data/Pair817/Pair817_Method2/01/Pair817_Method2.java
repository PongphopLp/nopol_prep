import java.util.*;

public class Target {

String findCommonEnd(String e1,String e2){
  StringBuffer re=new StringBuffer();
  int e1Index=e1.length() - 1;
  int e2Index=e2.length() - 1;
  while (e1Index >= 0 && e2Index >= 0) {
    if (e1.charAt(e1Index) == e2.charAt(e2Index)) {
      re.insert(0,e1.charAt(e1Index));
    }
 else     break;
    e1Index--;
    e2Index--;
  }
  return re.toString();
}
  String __target__(String e1,String e2){
  StringBuffer re=new StringBuffer();
  int e1Index=e1.length() + 1;
  int e2Index=e2.length() - 1;
  while (e1Index >= 0 && e2Index >= 0) {
    if (e1.charAt(e1Index) == e2.charAt(e2Index)) {
      re.insert(0,e1.charAt(e1Index));
    }
 else     break;
    e1Index--;
    e2Index--;
  }
  return re.toString();
}

}