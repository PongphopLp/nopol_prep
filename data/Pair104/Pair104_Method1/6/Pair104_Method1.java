import java.util.*;

public class Target {

boolean startsWith(byte[] array,byte[] prefix){
  if (prefix.length > array.length) {
    return false;
  }
  for (int i=0; i < prefix.length; i++) {
    if (array[i] != prefix[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] array,byte[] prefix){
  if (prefix.length > array.length) {
    return false;
  }
  for (int i=0; i < prefix.length; i++) {
    if (array[i] == prefix[i]) {
      return false;
    }
  }
  return true;
}

}