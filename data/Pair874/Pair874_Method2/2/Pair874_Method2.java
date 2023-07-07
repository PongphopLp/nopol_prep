import java.util.*;

public class Target {

boolean equals(byte[] gcrData,int from,int to,int length){
  for (int i=0; i < length; i++) {
    if (gcrData[from + i] != gcrData[to + i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] gcrData,int from,int to,int length){
  for (int i=0; i < length; i++) {
    if (gcrData[from + i] == gcrData[to + i]) {
      return false;
    }
  }
  return true;
}

}