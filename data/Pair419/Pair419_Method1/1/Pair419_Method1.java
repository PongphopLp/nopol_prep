import java.util.*;

public class Target {

boolean isSameFace(int thisArray,int thisFace,int thatArray,int thatFace){
  if ((thisArray == thatArray) && (thisFace == thatFace)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int thisArray,int thisFace,int thatArray,int thatFace){
  if ((thisArray != thatArray) && (thisFace == thatFace)) {
    return true;
  }
 else {
    return false;
  }
}

}