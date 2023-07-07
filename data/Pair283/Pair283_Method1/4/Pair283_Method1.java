import java.util.*;

public class Target {

byte[] fillUDPDataArray(byte[] result,byte[] fill,int position){
  for (int i=position; i < position + fill.length; i++) {
    result[i]=fill[i - position];
  }
  return result;
}
  byte[] __target__(byte[] result,byte[] fill,int position){
  for (int i=position; i < position - fill.length; i++) {
    result[i]=fill[i - position];
  }
  return result;
}

}