import java.util.*;

public class Target {

int[] byteArray2IntArray(byte[] byteArray){
  int j=0;
  byte[] newBA;
  int mod=byteArray.length % 4;
switch (mod) {
case 3:    newBA=new byte[byteArray.length + 1];
  break;
case 2:newBA=new byte[byteArray.length + 2];
break;
case 1:newBA=new byte[byteArray.length + 3];
break;
default:newBA=new byte[byteArray.length + 0];
break;
}
System.arraycopy(byteArray,0,newBA,0,byteArray.length);
int[] newSeed=new int[newBA.length / 4];
for (int i=0; i < newBA.length; i+=4) {
newSeed[j]=newBA[i + 3] & 0xFF;
newSeed[j]|=(newBA[i + 2] << 8) & 0xFF00;
newSeed[j]|=(newBA[i + 1] << 16) & 0xFF0000;
newSeed[j]|=(newBA[i + 0] << 24) & 0xFF000000;
j++;
}
return newSeed;
}
  int[] __target__(byte[] byteArray){
  int j=0;
  byte[] newBA;
  int mod=byteArray.length % 4;
switch (mod) {
case 3:    newBA=new byte[byteArray.length + 1];
  break;
case 2:newBA=new byte[byteArray.length + 2];
break;
case 1:newBA=new byte[byteArray.length + 3];
break;
default:newBA=new byte[byteArray.length + 0];
break;
}
System.arraycopy(byteArray,0,newBA,0,byteArray.length);
int[] newSeed=new int[newBA.length / 4];
for (int i=0; i <= newBA.length; i+=4) {
newSeed[j]=newBA[i + 3] & 0xFF;
newSeed[j]|=(newBA[i + 2] << 8) & 0xFF00;
newSeed[j]|=(newBA[i + 1] << 16) & 0xFF0000;
newSeed[j]|=(newBA[i + 0] << 24) & 0xFF000000;
j++;
}
return newSeed;
}

}