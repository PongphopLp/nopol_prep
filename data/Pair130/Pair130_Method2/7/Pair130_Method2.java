import java.util.*;

public class Target {

int retrieveIntfromBytes(byte[] b){
  int bla=0;
  int blu=0;
  int mal=1;
  for (int i=3; i >= 0; i--) {
    blu=b[i];
    if (blu < 0)     blu=256 + blu;
    bla+=blu * mal;
    mal*=256;
  }
  return bla;
}
  int __target__(byte[] b){
  int bla=0;
  int blu=0;
  int mal=1;
  for (int i=3; i >= 0; i--) {
    blu=b[i];
    if (blu <= 0)     blu=256 + blu;
    bla+=blu * mal;
    mal*=256;
  }
  return bla;
}

}