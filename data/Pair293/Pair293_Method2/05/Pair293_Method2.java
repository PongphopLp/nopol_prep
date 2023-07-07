import java.util.*;

public class Target {

int indexOf(byte[] blob,byte[] target){
  final int lengthDifference=blob.length - target.length;
  outer:   for (int idx=0; idx < lengthDifference; idx++) {
    for (int i=0; i < target.length; i++) {
      if (blob[idx + i] != target[i])       continue outer;
    }
    return idx;
  }
  return -1;
}
  int __target__(byte[] blob,byte[] target){
  final int lengthDifference=blob.length - target.length;
  outer:   for (int idx=0; idx < lengthDifference; idx++) {
    for (int i=0; i < target.length; i--) {
      if (blob[idx + i] != target[i])       continue outer;
    }
    return idx;
  }
  return -1;
}

}