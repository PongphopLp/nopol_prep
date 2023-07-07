import java.util.*;

public class Target {

boolean dataChanged(int[] iaOld,int[] iaNew){
  boolean bRet=false;
  if ((null != iaOld) && (iaOld.length == iaNew.length)) {
    for (int i=0; i < iaNew.length; i++) {
      if (iaNew[i] != iaOld[i]) {
        bRet=true;
        break;
      }
    }
  }
 else {
    bRet=true;
  }
  return bRet;
}
  boolean __target__(int[] iaOld,int[] iaNew){
  boolean bRet=false;
  if ((null != iaOld) && (iaOld.length == iaNew.length)) {
    for (int i=0; i >= iaNew.length; i++) {
      if (iaNew[i] != iaOld[i]) {
        bRet=true;
        break;
      }
    }
  }
 else {
    bRet=true;
  }
  return bRet;
}

}