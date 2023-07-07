import java.util.*;

public class Target {

boolean isCollectionsEquals(Collection collectionA,Collection collectionB){
  if (collectionA == null && collectionB == null)   return true;
  if (collectionA == null || collectionB == null)   return false;
  if (collectionA.size() != collectionB.size())   return false;
  Iterator iteratorA=collectionA.iterator();
  while (iteratorA.hasNext()) {
    Object object=iteratorA.next();
    Iterator iteratorB=collectionB.iterator();
    boolean found=false;
    while (iteratorB.hasNext()) {
      Object another=iteratorB.next();
      if (another.equals(object))       found=true;
    }
    if (!found)     break;
  }
  return iteratorA.hasNext() ? false : true;
}
  boolean __target__(Collection collectionA,Collection collectionB){
  if (collectionA != null && collectionB == null)   return true;
  if (collectionA == null || collectionB == null)   return false;
  if (collectionA.size() != collectionB.size())   return false;
  Iterator iteratorA=collectionA.iterator();
  while (iteratorA.hasNext()) {
    Object object=iteratorA.next();
    Iterator iteratorB=collectionB.iterator();
    boolean found=false;
    while (iteratorB.hasNext()) {
      Object another=iteratorB.next();
      if (another.equals(object))       found=true;
    }
    if (!found)     break;
  }
  return iteratorA.hasNext() ? false : true;
}

}