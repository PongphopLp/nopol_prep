import java.util.*;

public class Target {

String replace(String str,String find,String replace){
  int strlen, findlen;
  char[] chars, replaceChars;
  if (str == null || ((strlen=(chars=str.toCharArray()).length) < (findlen=find.length()))) {
    return str;
  }
  replaceChars=replace.toCharArray();
  final StringBuilder sb=new StringBuilder(strlen);
  int sCut=0;
  for (int eCut; (eCut=str.indexOf(find,sCut)) != -1; sCut=eCut + findlen) {
    sb.append(chars,sCut,(eCut - sCut)).append(replaceChars);
  }
  return sCut > 0 ? sb.append(chars,sCut,(strlen - sCut)).toString() : str;
}
  String __target__(String str,String find,String replace){
  int strlen, findlen;
  char[] chars, replaceChars;
  if (str == null || ((strlen=(chars=str.toCharArray()).length) < (findlen=find.length()))) {
    return str;
  }
  replaceChars=replace.toCharArray();
  final StringBuilder sb=new StringBuilder(strlen);
  int sCut=0;
  for (int eCut; (eCut=str.indexOf(find,sCut)) != -1; sCut=eCut + findlen) {
    sb.append(chars,sCut,(eCut - sCut)).append(replaceChars);
  }
  return sCut >= 0 ? sb.append(chars,sCut,(strlen - sCut)).toString() : str;
}

}