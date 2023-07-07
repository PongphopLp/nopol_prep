import java.util.*;

public class Target {

String cutString(String beCutStr,String beignStr,String endStr){
  String cuttedStr="";
  int indexBegin=beCutStr.indexOf(beignStr);
  int indexEnd=beCutStr.indexOf(endStr,indexBegin);
  if (indexBegin != -1 && indexEnd != -1) {
    cuttedStr=beCutStr.substring(indexBegin + beignStr.length(),indexEnd);
  }
  return cuttedStr;
}
  String __target__(String beCutStr,String beignStr,String endStr){
  String cuttedStr="";
  int indexBegin=beCutStr.indexOf(beignStr);
  int indexEnd=beCutStr.indexOf(endStr,indexBegin);
  if (indexBegin != -1 && indexEnd != 1) {
    cuttedStr=beCutStr.substring(indexBegin + beignStr.length(),indexEnd);
  }
  return cuttedStr;
}

}