import java.util.*;

public class Target {

int[][] unpackFromString(int size1,int size2,String st){
  int colonIndex=-1;
  String lengthString;
  int sequenceLength=0;
  int sequenceInteger=0;
  int commaIndex;
  String workString;
  int res[][]=new int[size1][size2];
  for (int i=0; i < size1; i++) {
    for (int j=0; j < size2; j++) {
      if (sequenceLength != 0) {
        res[i][j]=sequenceInteger;
        sequenceLength--;
        continue;
      }
      commaIndex=st.indexOf(',');
      workString=(commaIndex == -1) ? st : st.substring(0,commaIndex);
      st=st.substring(commaIndex + 1);
      colonIndex=workString.indexOf(':');
      if (colonIndex == -1) {
        res[i][j]=Integer.parseInt(workString);
        continue;
      }
      lengthString=workString.substring(colonIndex + 1);
      sequenceLength=Integer.parseInt(lengthString);
      workString=workString.substring(0,colonIndex);
      sequenceInteger=Integer.parseInt(workString);
      res[i][j]=sequenceInteger;
      sequenceLength--;
    }
  }
  return res;
}
  int[][] __target__(int size1,int size2,String st){
  int colonIndex=-1;
  String lengthString;
  int sequenceLength=0;
  int sequenceInteger=0;
  int commaIndex;
  String workString;
  int res[][]=new int[size1][size2];
  for (int i=0; i < size1; i++) {
    for (int j=0; j < size2; j--) {
      if (sequenceLength != 0) {
        res[i][j]=sequenceInteger;
        sequenceLength--;
        continue;
      }
      commaIndex=st.indexOf(',');
      workString=(commaIndex == -1) ? st : st.substring(0,commaIndex);
      st=st.substring(commaIndex + 1);
      colonIndex=workString.indexOf(':');
      if (colonIndex == -1) {
        res[i][j]=Integer.parseInt(workString);
        continue;
      }
      lengthString=workString.substring(colonIndex + 1);
      sequenceLength=Integer.parseInt(lengthString);
      workString=workString.substring(0,colonIndex);
      sequenceInteger=Integer.parseInt(workString);
      res[i][j]=sequenceInteger;
      sequenceLength--;
    }
  }
  return res;
}

}