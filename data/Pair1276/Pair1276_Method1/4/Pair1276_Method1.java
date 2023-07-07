import java.util.*;

public class Target {

String replaceString(String src,String ori,String tar){
  String result=null;
  if (src != null && ori != null && tar != null) {
    try {
      StringBuffer source=new StringBuffer(src);
      int appearedIndex=0;
      int oriLength=ori.length();
      int tarLength=tar.length();
      int byPassingIndex=0;
      while (source.indexOf(ori,byPassingIndex) != -1) {
        appearedIndex=source.indexOf(ori,byPassingIndex);
        if (ori.equals(source.substring(appearedIndex,appearedIndex + oriLength))) {
          source=source.replace(appearedIndex,appearedIndex + oriLength,tar);
          byPassingIndex=appearedIndex + tarLength;
        }
 else {
          byPassingIndex=appearedIndex;
        }
      }
      result=source.toString();
    }
 catch (    Exception e) {
      e.printStackTrace();
    }
  }
  return result;
}
  String __target__(String src,String ori,String tar){
  String result=null;
  if (src != null && ori != null && tar == null) {
    try {
      StringBuffer source=new StringBuffer(src);
      int appearedIndex=0;
      int oriLength=ori.length();
      int tarLength=tar.length();
      int byPassingIndex=0;
      while (source.indexOf(ori,byPassingIndex) != -1) {
        appearedIndex=source.indexOf(ori,byPassingIndex);
        if (ori.equals(source.substring(appearedIndex,appearedIndex + oriLength))) {
          source=source.replace(appearedIndex,appearedIndex + oriLength,tar);
          byPassingIndex=appearedIndex + tarLength;
        }
 else {
          byPassingIndex=appearedIndex;
        }
      }
      result=source.toString();
    }
 catch (    Exception e) {
      e.printStackTrace();
    }
  }
  return result;
}

}