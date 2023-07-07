import java.util.*;

public class Target {

int parseTreeEntry(String sEntry,int rgIdx[]){
  int iElements=0;
  if ((null != sEntry) && (null != rgIdx)) {
    int iIdx, iPos;
    iPos=-1;
    iIdx=0;
    do {
      if (-1 != (iPos=sEntry.indexOf('.',iPos + 1))) {
        rgIdx[iIdx]=iPos;
      }
 else {
        rgIdx[iIdx]=sEntry.length();
      }
    }
 while ((++iIdx < rgIdx.length) && (-1 != iPos));
    iElements=iIdx;
  }
  return iElements;
}
  int __target__(String sEntry,int rgIdx[]){
  int iElements=0;
  if ((null != sEntry) && (null == rgIdx)) {
    int iIdx, iPos;
    iPos=-1;
    iIdx=0;
    do {
      if (-1 != (iPos=sEntry.indexOf('.',iPos + 1))) {
        rgIdx[iIdx]=iPos;
      }
 else {
        rgIdx[iIdx]=sEntry.length();
      }
    }
 while ((++iIdx < rgIdx.length) && (-1 != iPos));
    iElements=iIdx;
  }
  return iElements;
}

}