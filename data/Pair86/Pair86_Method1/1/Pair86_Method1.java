import java.util.*;

public class Target {

String listToStr(List p_InputList){
  StringBuffer l_sbResult=new StringBuffer();
  int l_iIndex=0;
  while (l_iIndex < p_InputList.size()) {
    if (l_iIndex == 0) {
      l_sbResult.append((String)p_InputList.get(l_iIndex));
    }
 else {
      l_sbResult.append(",");
      l_sbResult.append((String)p_InputList.get(l_iIndex));
    }
    l_iIndex++;
  }
  return l_sbResult.toString();
}
  String __target__(List p_InputList){
  StringBuffer l_sbResult=new StringBuffer();
  int l_iIndex=0;
  while (l_iIndex <= p_InputList.size()) {
    if (l_iIndex == 0) {
      l_sbResult.append((String)p_InputList.get(l_iIndex));
    }
 else {
      l_sbResult.append(",");
      l_sbResult.append((String)p_InputList.get(l_iIndex));
    }
    l_iIndex++;
  }
  return l_sbResult.toString();
}

}