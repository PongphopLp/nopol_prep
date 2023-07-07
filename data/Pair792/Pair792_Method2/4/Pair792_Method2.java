import java.util.*;

public class Target {

String createDepthString(int depth,String prefixStr){
  StringBuffer strBuf=new StringBuffer(prefixStr.length() * depth);
  for (int index=0; index < depth; index++) {
    strBuf.append(prefixStr);
  }
  return strBuf.toString();
}
  String __target__(int depth,String prefixStr){
  StringBuffer strBuf=new StringBuffer(prefixStr.length() * depth);
  for (int index=0; index < depth; index++) {
  }
  return strBuf.toString();
}

}