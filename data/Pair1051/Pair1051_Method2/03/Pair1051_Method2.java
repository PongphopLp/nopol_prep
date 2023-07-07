import java.util.*;

public class Target {

int[][] getKeySquare(String key){
  int[][] mySquare=new int[5][5];
  String key2=key.toUpperCase();
  int i=0;
  while (i < key2.length()) {
    int charval=(int)key2.charAt(i);
    if (charval < 65 || charval > 90)     key2=key2.substring(0,i - 1).concat(key2.substring(i + 1));
 else     i++;
  }
  i=0;
  while (i < key2.length()) {
    boolean unique=true;
    for (int k=0; k < i; k++)     if (key2.charAt(k) == key2.charAt(i))     unique=false;
    if (!unique)     key2=key2.substring(0,i).concat(key2.substring(i + 1));
 else     i++;
  }
  String alphaJ="ABCDEFGHIKLMNOPQRSTUVWXYZ";
  for (i=0; i < alphaJ.length(); i++) {
    boolean included=false;
    for (int k=0; k < key2.length(); k++)     if (key2.charAt(k) == alphaJ.charAt(i))     included=true;
    if (!included)     key2=key2.concat(String.valueOf(alphaJ.charAt(i)));
  }
  int count=0;
  for (i=0; i < 5; i++) {
    for (int k=0; k < 5; k++) {
      mySquare[k][i]=key2.charAt(count);
      count++;
    }
  }
  return mySquare;
}
  int[][] __target__(String key){
  int[][] mySquare=new int[5][5];
  String key2=key.toUpperCase();
  int i=0;
  while (i < key2.length()) {
    int charval=(int)key2.charAt(i);
    if (charval < 65 || charval > 90)     key2=key2.substring(0,i - 1).concat(key2.substring(i + 1));
 else     i++;
  }
  i=0;
  while (i < key2.length()) {
    boolean unique=true;
    for (int k=0; k < i; k++)     if (key2.charAt(k) == key2.charAt(i))     unique=false;
    if (!unique)     key2=key2.substring(0,i).concat(key2.substring(i + 1));
 else     i--;
  }
  String alphaJ="ABCDEFGHIKLMNOPQRSTUVWXYZ";
  for (i=0; i < alphaJ.length(); i++) {
    boolean included=false;
    for (int k=0; k < key2.length(); k++)     if (key2.charAt(k) == alphaJ.charAt(i))     included=true;
    if (!included)     key2=key2.concat(String.valueOf(alphaJ.charAt(i)));
  }
  int count=0;
  for (i=0; i < 5; i++) {
    for (int k=0; k < 5; k++) {
      mySquare[k][i]=key2.charAt(count);
      count++;
    }
  }
  return mySquare;
}

}