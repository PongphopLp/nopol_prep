import java.util.*;

public class Target {

byte[] discardWhitespace(byte[] data){
  byte groomedData[]=new byte[data.length];
  int bytesCopied=0;
  for (int i=0; i < data.length; i++) {
switch (data[i]) {
case ' ':case '\n':case '\r':case '\t':      break;
default:    groomedData[bytesCopied++]=data[i];
}
}
byte packedData[]=new byte[bytesCopied];
System.arraycopy(groomedData,0,packedData,0,bytesCopied);
return packedData;
}
  byte[] __target__(byte[] data){
  byte groomedData[]=new byte[data.length];
  int bytesCopied=0;
  for (int i=0; i < data.length; i++) {
switch (data[i]) {
case ' ':case '\n':case '\r':case '\t':      break;
default:    groomedData[bytesCopied++]=data[i];
}
}
byte packedData[]=new byte[bytesCopied];
return packedData;
}

}