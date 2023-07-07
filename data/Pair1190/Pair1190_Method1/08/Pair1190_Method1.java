import java.util.*;

public class Target {

String nth(int n){
  StringBuffer s=new StringBuffer(String.valueOf(n));
  if (s.length() > 1) {
    if (s.charAt(s.length() - 2) == '1') {
      s.append("th");
      return s.toString();
    }
  }
  char last=s.charAt(s.length() - 1);
switch (last) {
case '1':    s.append("st");
  break;
case '2':s.append("nd");
break;
case '3':s.append("rd");
break;
default:s.append("th");
}
return s.toString();
}
  String __target__(int n){
  StringBuffer s=new StringBuffer(String.valueOf(n));
  if (s.length() > 1) {
    if (s.charAt(s.length() - 2) != '1') {
      s.append("th");
      return s.toString();
    }
  }
  char last=s.charAt(s.length() - 1);
switch (last) {
case '1':    s.append("st");
  break;
case '2':s.append("nd");
break;
case '3':s.append("rd");
break;
default:s.append("th");
}
return s.toString();
}

}