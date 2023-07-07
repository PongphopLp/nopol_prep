import java.util.*;

public class Target {

boolean equalsSet(Collection c1,Collection c2){
  boolean equals;
  if (c1 == null) {
    equals=(c2 == null);
  }
 else   if (c2 == null) {
    equals=false;
  }
 else   if (c1.size() == c2.size()) {
    equals=true;
    Iterator iterC1=c1.iterator();
    while (equals && iterC1.hasNext()) {
      Object o1=iterC1.next();
      equals=c2.contains(o1);
    }
  }
 else {
    equals=false;
  }
  return equals;
}
  boolean __target__(Collection c1,Collection c2){
  boolean equals;
  if (c1 == null) {
    equals=(c2 == null);
  }
 else   if (c2 != null) {
    equals=false;
  }
 else   if (c1.size() == c2.size()) {
    equals=true;
    Iterator iterC1=c1.iterator();
    while (equals && iterC1.hasNext()) {
      Object o1=iterC1.next();
      equals=c2.contains(o1);
    }
  }
 else {
    equals=false;
  }
  return equals;
}

}