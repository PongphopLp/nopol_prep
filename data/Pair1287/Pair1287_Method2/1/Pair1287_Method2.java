import java.util.*;

public class Target {

boolean areValidArgTypes(Class[] paramTypes,Class[] argTypes){
  if (paramTypes.length != argTypes.length)   return false;
  for (int i=0; i < argTypes.length; i++) {
    if (!paramTypes[i].isAssignableFrom(argTypes[i]))     return false;
  }
  return true;
}
  boolean __target__(Class[] paramTypes,Class[] argTypes){
  if (paramTypes.length == argTypes.length)   return false;
  for (int i=0; i < argTypes.length; i++) {
    if (!paramTypes[i].isAssignableFrom(argTypes[i]))     return false;
  }
  return true;
}

}