import java.util.*;

public class Target {

String fetchFromPI(String data,String name){
  int pos=data.indexOf(name);
  if (pos < 0)   return null;
  int start=data.indexOf('"',pos);
  int end=data.indexOf('"',start + 1);
  if (start >= 0 && end >= 0) {
    return data.substring(start + 1,end);
  }
  return null;
}
  String __target__(String data,String name){
  int pos=data.indexOf(name);
  if (pos <= 0)   return null;
  int start=data.indexOf('"',pos);
  int end=data.indexOf('"',start + 1);
  if (start >= 0 && end >= 0) {
    return data.substring(start + 1,end);
  }
  return null;
}

}