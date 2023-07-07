import java.util.*;

public class Target {

boolean compare(byte[] bytes1,byte[] bytes2){
  boolean result=(bytes1.length == bytes2.length);
  for (int i=0; i < bytes1.length && result; i++) {
    result=bytes1[i] == bytes2[i];
  }
  return result;
}
  boolean __target__(byte[] bytes1,byte[] bytes2){
  boolean result=(bytes1.length != bytes2.length);
  for (int i=0; i < bytes1.length && result; i++) {
    result=bytes1[i] == bytes2[i];
  }
  return result;
}

}