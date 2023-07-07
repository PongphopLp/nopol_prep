import java.util.*;

public class Target {

int getWord(byte[] content,int index,int size){
  int result=0;
  for (int i=0; i < size; i++) {
    result=(result << 8) + (content[index + i] & 0xff);
  }
  return result;
}
  int __target__(byte[] content,int index,int size){
  int result=0;
  for (int i=0; i < size; i++) {
    result=(result << 8) + (content[index + i] | 0xff);
  }
  return result;
}

}