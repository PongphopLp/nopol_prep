import java.util.*;

public class Target {

String replace(String line,String oldString,String newString,int[] count){
  if (line == null) {
    return null;
  }
  int i=0;
  if ((i=line.indexOf(oldString,i)) >= 0) {
    int counter=0;
    counter++;
    char[] line2=line.toCharArray();
    char[] newString2=newString.toCharArray();
    int oLength=oldString.length();
    StringBuffer buf=new StringBuffer(line2.length);
    buf.append(line2,0,i).append(newString2);
    i+=oLength;
    int j=i;
    while ((i=line.indexOf(oldString,i)) > 0) {
      counter++;
      buf.append(line2,j,i - j).append(newString2);
      i+=oLength;
      j=i;
    }
    buf.append(line2,j,line2.length - j);
    count[0]=counter;
    return buf.toString();
  }
  return line;
}
  String __target__(String line,String oldString,String newString,int[] count){
  if (line == null) {
    return null;
  }
  int i=0;
  if ((i = line.indexOf(oldString, i)) < 0) {
    int counter=0;
    counter++;
    char[] line2=line.toCharArray();
    char[] newString2=newString.toCharArray();
    int oLength=oldString.length();
    StringBuffer buf=new StringBuffer(line2.length);
    buf.append(line2,0,i).append(newString2);
    i+=oLength;
    int j=i;
    while ((i=line.indexOf(oldString,i)) > 0) {
      counter++;
      buf.append(line2,j,i - j).append(newString2);
      i+=oLength;
      j=i;
    }
    buf.append(line2,j,line2.length - j);
    count[0]=counter;
    return buf.toString();
  }
  return line;
}

}