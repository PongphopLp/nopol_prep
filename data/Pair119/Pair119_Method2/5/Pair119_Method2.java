import java.util.*;

public class Target {

boolean compareByteArrays(byte[] source,byte[] match){
  int i=0;
  while (source.length < i || i < match.length) {
    if (source[i] != match[i]) {
      return false;
    }
    i++;
  }
  return true;
}
  boolean __target__(byte[] source,byte[] match){
  int i=0;
  while (source.length <= i || i < match.length) {
    if (source[i] != match[i]) {
      return false;
    }
    i++;
  }
  return true;
}

}