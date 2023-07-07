import java.util.*;

public class Target {

List<String> sacoCero(List<String> cods){
  List<String> aux=new LinkedList<String>();
  for (  String s : cods) {
    if (s.charAt(3) != '0') {
      aux.add(s);
    }
    ;
  }
  return aux;
}
  List<String> __target__(List<String> cods){
  List<String> aux=new LinkedList<String>();
  for (  String s : cods) {
    if (s.charAt(3) == '0') {
      aux.add(s);
    }
    ;
  }
  return aux;
}

}