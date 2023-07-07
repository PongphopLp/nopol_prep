import java.util.*;

public class Target {

byte[] part_of_byte_array(byte[] src,int start,int end){
  final int cells=end - start + 1;
  byte[] n=new byte[cells];
  for (int x=0; x < cells; x++) {
    n[x]=src[x + start];
  }
  return n;
}
  byte[] __target__(byte[] src,int start,int end){
  final int cells=end + start + 1;
  byte[] n=new byte[cells];
  for (int x=0; x < cells; x++) {
    n[x]=src[x + start];
  }
  return n;
}

}