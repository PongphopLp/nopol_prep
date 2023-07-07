import java.util.*;

public class Target {

boolean compareByteArrays(byte[] baFirst,byte[] baSecond){
  if (baFirst.length == baSecond.length) {
    for (int i=0; i < baFirst.length; i++) {
      if (baFirst[i] != baSecond[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(byte[] baFirst,byte[] baSecond){
  if (baFirst.length != baSecond.length) {
    for (int i=0; i < baFirst.length; i++) {
      if (baFirst[i] != baSecond[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}