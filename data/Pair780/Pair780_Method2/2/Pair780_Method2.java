import java.util.*;

public class Target {

String toAsciiString(byte[] buffer,int startPos,int length){
  char[] charArray=new char[length];
  int readpoint=startPos;
  for (int i=0; i < length; i++) {
    charArray[i]=(char)buffer[readpoint];
    readpoint++;
  }
  return new String(charArray);
}
  String __target__(byte[] buffer,int startPos,int length){
  char[] charArray=new char[length];
  int readpoint=startPos;
  for (int i=0; i < length; i--) {
    charArray[i]=(char)buffer[readpoint];
    readpoint++;
  }
  return new String(charArray);
}

}