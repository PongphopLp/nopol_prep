import java.util.*;

public class Target {

int getColFromChar(char c){
switch (c) {
case 'A':    return 0;
case 'B':  return 1;
case 'C':return 2;
case 'D':return 3;
case 'E':return 4;
case 'F':return 5;
case 'G':return 6;
case 'H':return 7;
}
return -1;
}
  int __target__(char c){
switch (c) {
case 'A':    return 0;
case 'B':  return 0;
case 'C':return 2;
case 'D':return 3;
case 'E':return 4;
case 'F':return 5;
case 'G':return 6;
case 'H':return 7;
}
return -1;
}

}