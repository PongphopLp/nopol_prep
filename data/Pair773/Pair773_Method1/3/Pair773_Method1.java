import java.util.*;

public class Target {

String getZeroTerminatedStringInByteArrayAtPositionMaxLength(byte[] byteArray,int offset,int maxLength){
  int length=0;
  while ((0 != byteArray[offset + length]) && (length < maxLength))   length++;
  return new String(byteArray,offset,length);
}
  String __target__(byte[] byteArray,int offset,int maxLength){
  int length=0;
  while ((0 == byteArray[offset + length]) && (length < maxLength))   length++;
  return new String(byteArray,offset,length);
}

}