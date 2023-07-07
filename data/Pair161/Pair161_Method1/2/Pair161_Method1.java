import java.util.*;

public class Target {

String[] splitStringByLongDelimeter(String strSource,String strDelim){
  Vector vResult=new Vector();
  int iDelimWidth=strDelim.length();
  String strPiece;
  int iPrev=0;
  int iNext=strSource.indexOf(strDelim);
  while (iNext != -1) {
    strPiece=strSource.substring(iPrev,iNext);
    vResult.addElement(strPiece);
    iPrev=iNext + iDelimWidth;
    iNext=strSource.indexOf(strDelim,iPrev);
  }
  strPiece=strSource.substring(iPrev);
  if (strPiece.length() > 0) {
    vResult.addElement(strPiece);
  }
  String arstrResult[]=new String[vResult.size()];
  vResult.copyInto(arstrResult);
  return arstrResult;
}
  String[] __target__(String strSource,String strDelim){
  Vector vResult=new Vector();
  int iDelimWidth=strDelim.length();
  String strPiece;
  int iPrev=0;
  int iNext=strSource.indexOf(strDelim);
  while (iNext != -1) {
    strPiece=strSource.substring(iPrev,iNext);
    vResult.addElement(strPiece);
    iPrev=iNext + iDelimWidth;
    iNext=strSource.indexOf(strDelim,iPrev);
  }
  strPiece=strSource.substring(iPrev);
  if (strPiece.length() <= 0) {
    vResult.addElement(strPiece);
  }
  String arstrResult[]=new String[vResult.size()];
  vResult.copyInto(arstrResult);
  return arstrResult;
}

}