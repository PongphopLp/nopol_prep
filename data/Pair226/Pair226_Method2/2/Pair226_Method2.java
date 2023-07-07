import java.util.*;

public class Target {

boolean equals(short[] expected,short[] actual){
  if (actual == null) {
    return false;
  }
  if (actual.length != expected.length) {
    return false;
  }
  for (int i=0; i < expected.length; ++i) {
    if (expected[i] != actual[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(short[] expected,short[] actual){
  if (actual == null) {
    return false;
  }
  if (actual.length != expected.length) {
    return false;
  }
  for (int i=0; i <= expected.length; ++i) {
    if (expected[i] != actual[i]) {
      return false;
    }
  }
  return true;
}

}