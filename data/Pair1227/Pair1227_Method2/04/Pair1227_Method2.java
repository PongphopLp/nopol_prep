import java.util.*;

public class Target {

String escapeXMLChars(String input,boolean quote){
  StringBuffer out=new StringBuffer();
  if (input == null)   return null;
  int oldsize=input.length();
  char[] old=new char[oldsize];
  input.getChars(0,oldsize,old,0);
  int selstart=0;
  String entity=null;
  for (int i=0; i < oldsize; i++) {
switch (old[i]) {
case '&':      entity="&amp;";
    break;
case '<':  entity="&lt;";
break;
case '>':entity="&gt;";
break;
case '\'':if (quote) {
entity="&apos;";
break;
}
case '"':if (quote) {
entity="&quot;";
break;
}
}
if (entity != null) {
out.append(old,selstart,i - selstart);
out.append(entity);
selstart=i + 1;
entity=null;
}
}
if (selstart == 0) return input;
out.append(old,selstart,oldsize - selstart);
return out.toString();
}
  String __target__(String input,boolean quote){
  StringBuffer out=new StringBuffer();
  if (input == null)   return null;
  int oldsize=input.length();
  char[] old=new char[oldsize];
  input.getChars(0,oldsize,old,0);
  int selstart=0;
  String entity=null;
  for (int i=0; i < oldsize; i++) {
switch (old[i]) {
case '&':      entity="&amp;";
    break;
case '<':  entity="&lt;";
break;
case '>':entity="&gt;";
break;
case '\'':if (quote) {
entity="&apos;";
break;
}
case '"':if (quote) {
entity="&quot;";
break;
}
}
if (entity != null) {
out.append(old,selstart,i - selstart);
selstart=i + 1;
entity=null;
}
}
if (selstart == 0) return input;
out.append(old,selstart,oldsize - selstart);
return out.toString();
}

}