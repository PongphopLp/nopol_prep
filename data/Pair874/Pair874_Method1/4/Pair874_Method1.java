import java.util.*;

public class Target {

boolean arrayCompare(byte[] aArray,int aIndexA,int aIndexB,int aCompCount){
  boolean zReturn=true;
  for (int i=0; i < aCompCount; i++) {
    if (aArray[aIndexA + i] != aArray[aIndexB + i]) {
      zReturn=false;
      break;
    }
  }
  return zReturn;
}
  boolean __target__(byte[] aArray,int aIndexA,int aIndexB,int aCompCount){
  boolean zReturn=true;
  for (int i=0; i < aCompCount; i++) {
    if (aArray[aIndexA + i] != aArray[aIndexB - i]) {
      zReturn=false;
      break;
    }
  }
  return zReturn;
}

}