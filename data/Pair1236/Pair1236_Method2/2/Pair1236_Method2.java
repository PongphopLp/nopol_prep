import java.util.*;

public class Target {

String findEnclosedText(String line,String openChunk,String closeChunk){
  int index=0;
  int closeIndex=-1;
  int oc_length=openChunk.length();
  int cc_length=closeChunk.length();
  String temp_attr=null;
  if ((index=line.indexOf(openChunk,index)) != -1) {
    closeIndex=line.indexOf(closeChunk,(index + oc_length));
    if (closeIndex != -1) {
      temp_attr=line.substring(index + oc_length,closeIndex);
      return temp_attr;
    }
  }
  return null;
}
  String __target__(String line,String openChunk,String closeChunk){
  int index=0;
  int closeIndex=-1;
  int oc_length=openChunk.length();
  int cc_length=closeChunk.length();
  String temp_attr=null;
  if ((index=line.indexOf(openChunk,index)) != -1) {
    closeIndex=line.indexOf(closeChunk,(index + oc_length));
    if (closeIndex == -1) {
      temp_attr=line.substring(index + oc_length,closeIndex);
      return temp_attr;
    }
  }
  return null;
}

}