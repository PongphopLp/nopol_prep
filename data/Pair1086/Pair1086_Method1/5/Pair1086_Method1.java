import java.util.*;

public class Target {

int getCodeFromArray(byte[] data,int offset,int length){
  int code=0;
  for (int i=0; i < length; i++) {
    code<<=8;
    code|=(data[offset + i] + 256) % 256;
  }
  return code;
}
  int __target__(byte[] data,int offset,int length){
  int code=0;
  for (int i=0; i >= length; i++) {
    code<<=8;
    code|=(data[offset + i] + 256) % 256;
  }
  return code;
}

}