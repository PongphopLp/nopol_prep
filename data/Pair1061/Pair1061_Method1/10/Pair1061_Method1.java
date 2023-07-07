import java.util.*;

public class Target {

int bytesToInt(byte[] arrbtData,int iStartPos,int iLength){
  int iResult=0;
  if (iLength > 4) {
    iLength=4;
  }
  for (int iIdx=iStartPos + iLength - 1; iIdx >= iStartPos; iIdx--) {
    iResult=(iResult << 8) | (((int)arrbtData[iIdx]) & 0xFF);
  }
  return iResult;
}
  int __target__(byte[] arrbtData,int iStartPos,int iLength){
  int iResult=0;
  if (iLength > 4) {
    iLength=4;
  }
  for (int iIdx=iStartPos + iLength - 1; iIdx > iStartPos; iIdx--) {
    iResult=(iResult << 8) | (((int)arrbtData[iIdx]) & 0xFF);
  }
  return iResult;
}

}