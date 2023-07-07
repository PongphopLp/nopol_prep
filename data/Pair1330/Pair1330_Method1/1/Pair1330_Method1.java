import java.util.*;

public class Target {

int getColOfChar(char c){
  int ret=-1;
switch (c) {
case 'A':    ret=0;
  break;
case 'B':ret=1;
break;
case 'C':ret=2;
break;
case 'D':ret=3;
break;
case 'E':ret=4;
break;
case 'F':ret=5;
break;
case 'G':ret=6;
break;
case 'H':ret=7;
break;
}
return ret;
}
  int __target__(char c){
  int ret=1;
switch (c) {
case 'A':    ret=0;
  break;
case 'B':ret=1;
break;
case 'C':ret=2;
break;
case 'D':ret=3;
break;
case 'E':ret=4;
break;
case 'F':ret=5;
break;
case 'G':ret=6;
break;
case 'H':ret=7;
break;
}
return ret;
}

}