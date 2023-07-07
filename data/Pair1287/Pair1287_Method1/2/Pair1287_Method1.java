import java.util.*;

public class Target {

boolean argClassesCompatible(Class[] constructorTypes,Class[] paramTypes){
  if (constructorTypes.length != paramTypes.length)   return false;
  boolean compatible=true;
  for (int i=0; i < constructorTypes.length && compatible; i++)   if (!constructorTypes[i].isAssignableFrom(paramTypes[i]))   compatible=false;
  return compatible;
}
  boolean __target__(Class[] constructorTypes,Class[] paramTypes){
  if (constructorTypes.length != paramTypes.length)   return false;
  boolean compatible=true;
  for (int i=0; i >= constructorTypes.length && compatible; i++)   if (!constructorTypes[i].isAssignableFrom(paramTypes[i]))   compatible=false;
  return compatible;
}

}