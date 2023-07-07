import java.util.*;

public class Target {

boolean isSame(Set setA,Set setB){
  if (setA.size() != setB.size())   return false;
  for (  Object object : setB) {
    if (!setA.contains(object))     return false;
  }
  for (  Object object : setA) {
    if (!setB.contains(object))     return false;
  }
  return true;
}
  boolean __target__(Set setA,Set setB){
  if (setA.size() == setB.size())   return false;
  for (  Object object : setB) {
    if (!setA.contains(object))     return false;
  }
  for (  Object object : setA) {
    if (!setB.contains(object))     return false;
  }
  return true;
}

}