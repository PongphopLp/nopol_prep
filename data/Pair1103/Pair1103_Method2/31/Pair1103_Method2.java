import java.util.*;

public class Target {

String getRomanValue(int value,boolean isUpperCase){
  char[] fiveLetterUpper={'V','L','D'};
  char[] unitLetterUpper={'I','X','C','M'};
  char[] fiveLetterLower={'v','l','d'};
  char[] unitLetterLower={'i','x','c','m'};
  char[] fiveLetter=isUpperCase ? fiveLetterUpper : fiveLetterLower;
  char[] unitLetter=isUpperCase ? unitLetterUpper : unitLetterLower;
  int[] divisor={10,10,10,1000000};
  String s="";
  for (int group=0; value > 0; group++) {
    int remdr=(int)(value % divisor[group]);
    value=value / divisor[group];
    StringBuilder t;
    if (group == 3) {
      t=new StringBuilder(remdr);
      for (int j=0; j < remdr; j++) {
        t.append(unitLetter[group]);
      }
    }
 else {
      t=new StringBuilder(3);
switch (remdr) {
case 0:        break;
case 1:      t.append(unitLetter[group]);
    break;
case 2:  t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 3:t.append(unitLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 4:t.append(unitLetter[group]);
t.append(fiveLetter[group]);
break;
case 5:t.append(fiveLetter[group]);
break;
case 6:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
break;
case 7:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 8:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 9:t.append(unitLetter[group]);
t.append(unitLetter[group + 1]);
break;
}
}
s=t + s;
}
return s;
}
  String __target__(int value,boolean isUpperCase){
  char[] fiveLetterUpper={'V','L','D'};
  char[] unitLetterUpper={'I','X','C','M'};
  char[] fiveLetterLower={'v','l','d'};
  char[] unitLetterLower={'i','x','c','m'};
  char[] fiveLetter=isUpperCase ? fiveLetterUpper : fiveLetterLower;
  char[] unitLetter=isUpperCase ? unitLetterUpper : unitLetterLower;
  int[] divisor={10,10,10,1000000};
  String s="";
  for (int group=0; value >= 0; group++) {
    int remdr=(int)(value % divisor[group]);
    value=value / divisor[group];
    StringBuilder t;
    if (group == 3) {
      t=new StringBuilder(remdr);
      for (int j=0; j < remdr; j++) {
        t.append(unitLetter[group]);
      }
    }
 else {
      t=new StringBuilder(3);
switch (remdr) {
case 0:        break;
case 1:      t.append(unitLetter[group]);
    break;
case 2:  t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 3:t.append(unitLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 4:t.append(unitLetter[group]);
t.append(fiveLetter[group]);
break;
case 5:t.append(fiveLetter[group]);
break;
case 6:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
break;
case 7:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 8:t.append(fiveLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
t.append(unitLetter[group]);
break;
case 9:t.append(unitLetter[group]);
t.append(unitLetter[group + 1]);
break;
}
}
s=t + s;
}
return s;
}

}