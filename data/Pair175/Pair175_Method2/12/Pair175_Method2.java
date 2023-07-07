import java.util.*;

public class Target {

String[] split(String text,String run){
  int n=1;
  int i=text.indexOf(run);
  String[] lines;
  int runLen=run.length();
  if (i < 0 || runLen == 0) {
    lines=new String[1];
    lines[0]=text;
    return lines;
  }
  int len=text.length() - runLen;
  for (; i >= 0 && i < len; n++)   i=text.indexOf(run,i + runLen);
  lines=new String[n];
  i=0;
  int ipt=0;
  int pt=0;
  for (; (ipt=text.indexOf(run,i)) >= 0 && pt + 1 < n; ) {
    lines[pt++]=text.substring(i,ipt);
    i=ipt + runLen;
  }
  if (text.indexOf(run,len) != len)   len+=runLen;
  lines[pt]=text.substring(i,len);
  return lines;
}
  String[] __target__(String text,String run){
  int n=1;
  int i=text.indexOf(run);
  String[] lines;
  int runLen=run.length();
  if (i >= 0 || runLen == 0) {
    lines=new String[1];
    lines[0]=text;
    return lines;
  }
  int len=text.length() - runLen;
  for (; i >= 0 && i < len; n++)   i=text.indexOf(run,i + runLen);
  lines=new String[n];
  i=0;
  int ipt=0;
  int pt=0;
  for (; (ipt=text.indexOf(run,i)) >= 0 && pt + 1 < n; ) {
    lines[pt++]=text.substring(i,ipt);
    i=ipt + runLen;
  }
  if (text.indexOf(run,len) != len)   len+=runLen;
  lines[pt]=text.substring(i,len);
  return lines;
}

}