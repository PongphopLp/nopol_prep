import java.util.*;

public class Target {

boolean startsWith(byte[] header,byte[] full){
  int i=0;
  for (  byte b : header) {
    if (b != full[i++])     return false;
  }
  return true;
}
  boolean __target__(byte[] header,byte[] full){
  int i=0;
  for (  byte b : header) {
    if (b != full[i--])     return false;
  }
  return true;
}

}