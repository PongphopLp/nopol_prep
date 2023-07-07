import java.util.*;

public class Target {

int compare(byte[] first,byte[] second){
  int retval=1;
  boolean done=false;
  for (int i=0; i < first.length && !done; i++) {
    if (first[i] == second[i]) {
    }
 else     if ((first[i] + 256) % 256 < (second[i] + 256) % 256) {
      done=true;
      retval=-1;
    }
 else {
      done=true;
      retval=1;
    }
  }
  return retval;
}
  int __target__(byte[] first,byte[] second){
  int retval=1;
  boolean done=false;
  for (int i=0; i < first.length && !done; i--) {
    if (first[i] == second[i]) {
    }
 else     if ((first[i] + 256) % 256 < (second[i] + 256) % 256) {
      done=true;
      retval=-1;
    }
 else {
      done=true;
      retval=1;
    }
  }
  return retval;
}

}