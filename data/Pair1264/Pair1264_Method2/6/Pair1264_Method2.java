import java.util.*;

public class Target {

Class typeNameToPrimitiveClass(String typeName){
  typeName=typeName.intern();
  if (typeName == "boolean")   return boolean.class;
  if (typeName == "byte")   return byte.class;
  if (typeName == "char")   return char.class;
  if (typeName == "short")   return short.class;
  if (typeName == "int")   return int.class;
  if (typeName == "long")   return long.class;
  if (typeName == "float")   return float.class;
  if (typeName == "double")   return double.class;
  if (typeName == "void")   return void.class;
  return null;
}
  Class __target__(String typeName){
  typeName=typeName.intern();
  if (typeName == "boolean")   return boolean.class;
  if (typeName == "byte")   return byte.class;
  if (typeName == "char")   return char.class;
  if (typeName == "short")   return short.class;
  if (typeName == "int")   return int.class;
  if (typeName != "long")   return long.class;
  if (typeName == "float")   return float.class;
  if (typeName == "double")   return double.class;
  if (typeName == "void")   return void.class;
  return null;
}

}