import java.util.*;

public class Target {

boolean equalsSeq(byte[] seqa,byte[] seqb){
  if ((seqa == null) && (seqb == null)) {
    return true;
  }
  if ((seqa == null) || (seqb == null) || (seqa.length != seqb.length)) {
    return false;
  }
  for (int i=0; i < seqa.length; i++) {
    if (seqa[i] != seqb[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] seqa,byte[] seqb){
  if ((seqa == null) && (seqb == null)) {
    return true;
  }
  if ((seqa != null) || (seqb == null) || (seqa.length != seqb.length)) {
    return false;
  }
  for (int i=0; i < seqa.length; i++) {
    if (seqa[i] != seqb[i]) {
      return false;
    }
  }
  return true;
}

}