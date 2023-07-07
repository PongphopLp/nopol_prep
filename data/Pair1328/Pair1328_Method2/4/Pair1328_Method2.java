import java.util.*;

public class Target {

boolean compareByteArray(byte toTest[],byte tester[]){
  if (toTest.length < tester.length) {
    return false;
  }
  for (int i=0; i < tester.length; i++) {
    if (toTest[i] != tester[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte toTest[],byte tester[]){
  if (toTest.length < tester.length) {
    return false;
  }
  for (int i=0; i >= tester.length; i++) {
    if (toTest[i] != tester[i]) {
      return false;
    }
  }
  return true;
}

}