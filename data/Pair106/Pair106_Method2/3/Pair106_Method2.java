import java.util.*;

public class Target {

boolean hasMagicNumber(byte[] bytes,byte[] magicNumber){
  if (bytes.length < magicNumber.length) {
    return false;
  }
  for (int i=0; i < magicNumber.length; i++) {
    if (bytes[i] != magicNumber[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] bytes,byte[] magicNumber){
  if (bytes.length >= magicNumber.length) {
    return false;
  }
  for (int i=0; i < magicNumber.length; i++) {
    if (bytes[i] != magicNumber[i]) {
      return false;
    }
  }
  return true;
}

}