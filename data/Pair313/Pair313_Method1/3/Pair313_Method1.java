import java.util.*;

public class Target {

char getMnemonic(String str){
  char ch;
  int state=0;
  for (int i=0; i < str.length(); i++) {
    ch=str.charAt(i);
switch (state) {
case 0:      if (ch == '&')       state=1;
    break;
case 1:  if (ch != '&')   return ch;
state=0;
break;
}
}
return ' ';
}
  char __target__(String str){
  char ch;
  int state=0;
  for (int i=0; i < str.length(); i++) {
    ch=str.charAt(i);
switch (state) {
case 0:      if (ch != '&')       state=1;
    break;
case 1:  if (ch != '&')   return ch;
state=0;
break;
}
}
return ' ';
}

}