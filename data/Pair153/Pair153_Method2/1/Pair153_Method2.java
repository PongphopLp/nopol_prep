import java.util.*;

public class Target {

boolean compareArrayHeader(byte[] first,byte[] seond){
  boolean startsWith=true;
  int i=0;
  for (  byte toComp : first) {
    if (toComp != seond[i++]) {
      startsWith=false;
      break;
    }
  }
  return startsWith;
}
  boolean __target__(byte[] first,byte[] seond){
  boolean startsWith=true;
  int i=0;
  for (  byte toComp : first) {
    if (toComp == seond[i++]) {
      startsWith=false;
      break;
    }
  }
  return startsWith;
}

}