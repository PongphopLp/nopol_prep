import java.util.*;

public class Target {

byte[] subArray(byte[] data,int beginat,int count){
  byte[] answer=new byte[count];
  int srcidx=beginat;
  for (int destidx=0; destidx < count; destidx++) {
    answer[destidx]=data[srcidx];
    srcidx++;
  }
  return answer;
}
  byte[] __target__(byte[] data,int beginat,int count){
  byte[] answer=new byte[count];
  int srcidx=beginat;
  for (int destidx=0; destidx <= count; destidx++) {
    answer[destidx]=data[srcidx];
    srcidx++;
  }
  return answer;
}

}