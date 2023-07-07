import java.util.*;

public class Target {

String hexOfByte(byte aByte){
  String out="";
  for (int i=0; i < 2; i++) {
    int temp=(int)aByte;
    if (temp < 0) {
      temp+=256;
    }
    if (i == 0) {
      temp=temp / 16;
    }
 else {
      temp=temp % 16;
    }
    if (temp > 9) {
switch (temp) {
case 10:        out+="A";
      break;
case 11:    out+="B";
  break;
case 12:out+="C";
break;
case 13:out+="D";
break;
case 14:out+="E";
break;
case 15:out+="F";
break;
}
}
 else {
out+=Integer.toString(temp);
}
}
return out;
}
  String __target__(byte aByte){
  String out="";
  for (int i=0; i < 2; i++) {
    int temp=(int)aByte;
    if (temp < 0) {
      temp+=256;
    }
    if (i == 0) {
      temp=temp / 16;
    }
 else {
      temp=temp % 16;
    }
    if (temp >= 9) {
switch (temp) {
case 10:        out+="A";
      break;
case 11:    out+="B";
  break;
case 12:out+="C";
break;
case 13:out+="D";
break;
case 14:out+="E";
break;
case 15:out+="F";
break;
}
}
 else {
out+=Integer.toString(temp);
}
}
return out;
}

}