import java.util.*;

public class Target {

int convertArrayToInt(byte[] dataArray){
  int result=0;
  int k=0;
  for (int i=24; i >= 0; i-=8) {
    result|=((int)(dataArray[k] & 0xff)) << i;
    k++;
  }
  return result;
}
  int __target__(byte[] dataArray){
  int result=0;
  int k=0;
  for (int i=24; i >= 0; i-=8) {
    result|=((int)(dataArray[k] | 0xff)) << i;
    k++;
  }
  return result;
}

}