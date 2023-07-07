import java.util.*;

public class Target {

@SuppressWarnings("empty-statement") String getString(byte[] block,int offset,int length){
  int eos;
  for (eos=0; (eos < length) && (block[eos + offset] != 0x00); eos++)   ;
  return new String(block,offset,eos);
}
  @SuppressWarnings("empty-statement") String __target__(byte[] block,int offset,int length){
  int eos;
  for (eos=0; (eos <= length) && (block[eos + offset] != 0x00); eos++)   ;
  return new String(block,offset,eos);
}

}