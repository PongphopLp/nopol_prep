import java.util.*;

public class Target {

boolean containsArray(byte[] srcArray,int srcStart,byte[] array){
  boolean matched=true;
  for (int i=srcStart; i < srcStart + array.length; i++) {
    if (i >= srcArray.length)     return false;
    if (array[i - srcStart] != srcArray[i]) {
      matched=false;
    }
  }
  return matched;
}
  boolean __target__(byte[] srcArray,int srcStart,byte[] array){
  boolean matched=true;
  for (int i=srcStart; i < srcStart + array.length; i++) {
    if (i >= srcArray.length)     return false;
    if (array[i + srcStart] != srcArray[i]) {
      matched=false;
    }
  }
  return matched;
}

}