import java.util.*;

public class Target {

String diff_linesToCharsMunge(String text,List<String> lineArray,Map<String,Integer> lineHash){
  int lineStart=0;
  int lineEnd=-1;
  String line;
  StringBuilder chars=new StringBuilder();
  while (lineEnd < text.length() - 1) {
    lineEnd=text.indexOf('\n',lineStart);
    if (lineEnd == -1) {
      lineEnd=text.length() - 1;
    }
    line=text.substring(lineStart,lineEnd + 1);
    lineStart=lineEnd + 1;
    if (lineHash.containsKey(line)) {
      chars.append(String.valueOf((char)(int)lineHash.get(line)));
    }
 else {
      lineArray.add(line);
      lineHash.put(line,lineArray.size() - 1);
      chars.append(String.valueOf((char)(lineArray.size() - 1)));
    }
  }
  return chars.toString();
}
  String __target__(String text,List<String> lineArray,Map<String,Integer> lineHash){
  int lineStart=0;
  int lineEnd=-1;
  String line;
  StringBuilder chars=new StringBuilder();
  while (lineEnd < text.length() - 1) {
    lineEnd=text.indexOf('\n',lineStart);
    if (lineEnd == -1) {
      lineEnd=text.length() - 1;
    }
    line=text.substring(lineStart,lineEnd + 1);
    lineStart=lineEnd + 1;
    if (lineHash.containsKey(line)) {
      chars.append(String.valueOf((char)(int)lineHash.get(line)));
    }
 else {
      lineArray.add(line);
      lineHash.put(line,lineArray.size() - 1);
      chars.append(String.valueOf((char)(lineArray.size() + 1)));
    }
  }
  return chars.toString();
}

}