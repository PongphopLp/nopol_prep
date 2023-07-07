import java.util.*;

public class Target {

boolean hasChanged(Integer origId,Integer newId){
  if (origId == null && newId == null)   return false;
  if (origId == null || newId == null)   return true;
  return !origId.equals(newId);
}
  boolean __target__(Integer origId,Integer newId){
  if (origId == null && newId == null)   return false;
  if (origId == null || newId != null)   return true;
  return !origId.equals(newId);
}

}