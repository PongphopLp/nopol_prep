import java.util.*;

public class Target {

byte[] discardWhitespace(byte[] data){
  byte groomedData[]=new byte[data.length];
  int bytesCopied=0;
  for (  byte aByte : data) {
switch (aByte) {
case (byte)' ':case (byte)'\n':case (byte)'\r':case (byte)'\t':      break;
default:    groomedData[bytesCopied++]=aByte;
}
}
byte packedData[]=new byte[bytesCopied];
System.arraycopy(groomedData,0,packedData,0,bytesCopied);
return packedData;
}
  byte[] __target__(byte[] data){
  byte groomedData[]=new byte[data.length];
  int bytesCopied=0;
  for (  byte aByte : data) {
switch (aByte) {
case (byte)' ':case (byte)'\n':case (byte)'\r':case (byte)'\t':      break;
default:    groomedData[bytesCopied--]=aByte;
}
}
byte packedData[]=new byte[bytesCopied];
System.arraycopy(groomedData,0,packedData,0,bytesCopied);
return packedData;
}

}