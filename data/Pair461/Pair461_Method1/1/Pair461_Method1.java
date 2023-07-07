import java.util.*;

public class Target {

int[] setLengthFromBeginning(int[] data,int length){
  int[] ans=new int[length];
  int debut;
  if (length - data.length < 0)   debut=data.length - length;
 else   debut=0;
  System.arraycopy(data,0,ans,0,data.length - debut);
  return (ans);
}
  int[] __target__(int[] data,int length){
  int[] ans=new int[length];
  int debut;
  if (length - data.length <= 0)   debut=data.length - length;
 else   debut=0;
  System.arraycopy(data,0,ans,0,data.length - debut);
  return (ans);
}

}