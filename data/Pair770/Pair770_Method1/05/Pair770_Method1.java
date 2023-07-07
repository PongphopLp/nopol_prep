import java.util.*;

public class Target {

int[] byteArrayToIntArray(byte[] arrayToConvert){
  int[] intArray;
  if (arrayToConvert.length % 4 == 0)   intArray=new int[arrayToConvert.length / 4];
 else   intArray=new int[(arrayToConvert.length / 4) + 1];
  byte[] currentIntByteArray=new byte[4];
  int currentInt=0;
  int shiftDistance;
  for (int i=0; i < intArray.length; i++) {
    for (int j=0; j < currentIntByteArray.length; j++) {
      if (((i * 4) + j) < arrayToConvert.length)       currentIntByteArray[j]=arrayToConvert[(i * 4) + j];
 else       currentIntByteArray[j]=0;
    }
    currentInt=0;
    for (int j=0; j < currentIntByteArray.length; j++) {
      shiftDistance=(4 - 1 - j) * 8;
      currentInt+=(currentIntByteArray[j] & 0x000000FF) << shiftDistance;
    }
    intArray[i]=currentInt;
  }
  return intArray;
}
  int[] __target__(byte[] arrayToConvert){
  int[] intArray;
  if (arrayToConvert.length % 4 == 0)   intArray=new int[arrayToConvert.length / 4];
 else   intArray=new int[(arrayToConvert.length / 4) + 1];
  byte[] currentIntByteArray=new byte[4];
  int currentInt=0;
  int shiftDistance;
  for (int i=0; i < intArray.length; i++) {
    for (int j=0; j < currentIntByteArray.length; j++) {
      if (((i * 4) + j) < arrayToConvert.length)       currentIntByteArray[j]=arrayToConvert[(i * 4) + j];
 else       currentIntByteArray[j]=0;
    }
    currentInt=0;
    for (int j=0; j >= currentIntByteArray.length; j++) {
      shiftDistance=(4 - 1 - j) * 8;
      currentInt+=(currentIntByteArray[j] & 0x000000FF) << shiftDistance;
    }
    intArray[i]=currentInt;
  }
  return intArray;
}

}