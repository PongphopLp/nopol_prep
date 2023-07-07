import java.util.*;

public class Target {

String ConvertCaesar(String text,int shift){
  String strResult="";
  int intShiftToZero=0;
  for (  int intAsciiCode : text.toCharArray()) {
    if ((intAsciiCode >= 97) && (intAsciiCode <= 122))     intShiftToZero=97;
 else     if ((intAsciiCode >= 65) && (intAsciiCode <= 90))     intShiftToZero=65;
 else     intShiftToZero=0;
    if (intShiftToZero > 0) {
      intAsciiCode=intAsciiCode - intShiftToZero + shift;
      intAsciiCode=(intAsciiCode % 26) + intShiftToZero;
    }
    strResult+=(char)intAsciiCode;
  }
  return strResult;
}
  String __target__(String text,int shift){
  String strResult="";
  int intShiftToZero=0;
  for (  int intAsciiCode : text.toCharArray()) {
    if ((intAsciiCode >= 97) && (intAsciiCode > 122))     intShiftToZero=97;
 else     if ((intAsciiCode >= 65) && (intAsciiCode <= 90))     intShiftToZero=65;
 else     intShiftToZero=0;
    if (intShiftToZero > 0) {
      intAsciiCode=intAsciiCode - intShiftToZero + shift;
      intAsciiCode=(intAsciiCode % 26) + intShiftToZero;
    }
    strResult+=(char)intAsciiCode;
  }
  return strResult;
}

}