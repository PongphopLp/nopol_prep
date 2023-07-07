import java.util.*;

public class Target {

boolean equals(List<String> l1,List<String> l2){
  boolean retcode=(l1 == null ? (l2 == null) : (l2 != null && l1.size() == l2.size()));
  if (retcode == true && l1 != null) {
    final Iterator<String> lit=l1.iterator();
    while (lit.hasNext() == true && retcode == true) {
      retcode=l2.contains(lit.next());
    }
  }
  return (retcode);
}
  boolean __target__(List<String> l1,List<String> l2){
  boolean retcode=(l1 != null ? (l2 == null) : (l2 != null && l1.size() == l2.size()));
  if (retcode == true && l1 != null) {
    final Iterator<String> lit=l1.iterator();
    while (lit.hasNext() == true && retcode == true) {
      retcode=l2.contains(lit.next());
    }
  }
  return (retcode);
}

}