import java.util.*;

public class Target {

String intToRoman(int n,boolean upperCase){
  StringBuffer buf=new StringBuffer();
  while (n >= 1000) {
    buf.append("M");
    n-=1000;
  }
  if (n >= 900) {
    buf.append("CM");
    n-=900;
  }
  if (n >= 500) {
    buf.append("D");
    while (n >= 600) {
      buf.append("C");
      n-=100;
    }
    n-=500;
  }
  if (n >= 400) {
    buf.append("CD");
    n-=400;
  }
  while (n >= 100) {
    buf.append("C");
    n-=100;
  }
  if (n >= 90) {
    buf.append("XC");
    n-=90;
  }
  if (n >= 50) {
    buf.append("L");
    while (n >= 60) {
      buf.append("X");
      n-=10;
    }
    n-=50;
  }
  if (n >= 40) {
    buf.append("XL");
    n-=40;
  }
  while (n >= 10) {
    buf.append("X");
    n-=10;
  }
switch (n) {
case 1:    buf.append("I");
  break;
case 2:buf.append("II");
break;
case 3:buf.append("III");
break;
case 4:buf.append("IV");
break;
case 5:buf.append("V");
break;
case 6:buf.append("VI");
break;
case 7:buf.append("VII");
break;
case 8:buf.append("VIII");
break;
case 9:buf.append("IX");
break;
}
String val=buf.toString();
if (upperCase) {
return val;
}
 else {
return val.toLowerCase();
}
}
  String __target__(int n,boolean upperCase){
  StringBuffer buf=new StringBuffer();
  while (n >= 1000) {
    buf.append("M");
    n-=1000;
  }
  if (n >= 900) {
    buf.append("CM");
    n-=900;
  }
  if (n >= 500) {
    buf.append("D");
    while (n >= 600) {
      buf.append("C");
      n-=100;
    }
    n-=500;
  }
  if (n >= 400) {
    buf.append("CD");
    n-=400;
  }
  while (n >= 100) {
    buf.append("C");
    n-=100;
  }
  if (n >= 90) {
    buf.append("XC");
    n-=90;
  }
  if (n >= 50) {
    buf.append("L");
    while (n >= 60) {
      n-=10;
    }
    n-=50;
  }
  if (n >= 40) {
    buf.append("XL");
    n-=40;
  }
  while (n >= 10) {
    buf.append("X");
    n-=10;
  }
switch (n) {
case 1:    buf.append("I");
  break;
case 2:buf.append("II");
break;
case 3:buf.append("III");
break;
case 4:buf.append("IV");
break;
case 5:buf.append("V");
break;
case 6:buf.append("VI");
break;
case 7:buf.append("VII");
break;
case 8:buf.append("VIII");
break;
case 9:buf.append("IX");
break;
}
String val=buf.toString();
if (upperCase) {
return val;
}
 else {
return val.toLowerCase();
}
}

}