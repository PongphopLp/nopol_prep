import java.util.*;

public class Target {

int adjustedSize(int aSize,int aMinRecSize){
  int pMod=aSize % aMinRecSize;
  if (pMod != 0) {
    return aSize + aMinRecSize - pMod;
  }
  return aSize;
}
  int __target__(int aSize,int aMinRecSize){
  int pMod=aSize % aMinRecSize;
  if (pMod != 0) {
    return aSize + aMinRecSize + pMod;
  }
  return aSize;
}

}