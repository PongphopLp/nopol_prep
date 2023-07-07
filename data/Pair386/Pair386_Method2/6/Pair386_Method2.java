import java.util.*;

public class Target {

String padL(String phrase,char value,int size){
  StringBuffer buf=new StringBuffer();
  for (int i=0; i < (size - (phrase.length())); i++) {
    buf.append(value);
  }
  buf.append(phrase);
  return buf.toString();
}
  String __target__(String phrase,char value,int size){
  StringBuffer buf=new StringBuffer();
  for (int i=0; i < (size + (phrase.length())); i++) {
    buf.append(value);
  }
  buf.append(phrase);
  return buf.toString();
}

}