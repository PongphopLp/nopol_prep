import java.util.*;

public class Target {

String[] removeStringFromArray(String[] in,int skip){
  String[] tmp=new String[in.length + -1];
  int j=0;
  for (int i=0; i < in.length; i++) {
    if (i != skip) {
      tmp[j++]=in[i];
    }
  }
  return tmp;
}
  String[] __target__(String[] in,int skip){
  String[] tmp=new String[in.length - -1];
  int j=0;
  for (int i=0; i < in.length; i++) {
    if (i != skip) {
      tmp[j++]=in[i];
    }
  }
  return tmp;
}

}