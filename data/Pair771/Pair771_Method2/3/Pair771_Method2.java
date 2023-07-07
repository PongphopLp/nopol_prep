import java.util.*;

public class Target {

boolean areValidArgs(Class[] paramTypes,Object[] args){
  if (paramTypes.length != args.length)   return false;
  for (int i=0; i < args.length; i++) {
    if (!paramTypes[i].isInstance(args[i]))     return false;
  }
  return true;
}
  boolean __target__(Class[] paramTypes,Object[] args){
  if (paramTypes.length != args.length)   return false;
  for (int i=0; i < args.length; i--) {
    if (!paramTypes[i].isInstance(args[i]))     return false;
  }
  return true;
}

}