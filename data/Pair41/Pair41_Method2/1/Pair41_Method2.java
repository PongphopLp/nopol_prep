import java.util.*;

public class Target {

StringBuffer parseName(byte[] header,int offset,int length){
  StringBuffer result=new StringBuffer(length);
  int end=offset + length;
  for (int i=offset; i < end; ++i) {
    if (header[i] == 0)     break;
    result.append((char)header[i]);
  }
  return result;
}
  StringBuffer __target__(byte[] header,int offset,int length){
  StringBuffer result=new StringBuffer(length);
  int end=offset + length;
  for (int i=offset; i < end; --i) {
    if (header[i] == 0)     break;
    result.append((char)header[i]);
  }
  return result;
}

}