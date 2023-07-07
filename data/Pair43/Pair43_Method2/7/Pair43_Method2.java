import java.util.*;

public class Target {

boolean equals(byte[] x,byte[] y){
  int len=x.length < y.length ? x.length : y.length;
  int offset=0;
  while (len > 0) {
    if (x[offset] != y[offset])     return false;
    offset++;
    len--;
  }
  return true;
}
  boolean __target__(byte[] x,byte[] y){
  int len=x.length < y.length ? x.length : y.length;
  int offset=0;
  while (len > 0) {
    if (x[offset] == y[offset])     return false;
    offset++;
    len--;
  }
  return true;
}

}