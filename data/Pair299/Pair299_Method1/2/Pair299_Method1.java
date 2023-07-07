import java.util.*;

public class Target {

int diff(byte[] tok,byte[] tok2){
  final int l=Math.min(tok.length,tok2.length);
  for (int i=0; i != l; i++) {
    final int c=(tok[i] & 0xFF) - (tok2[i] & 0xFF);
    if (c != 0)     return c;
  }
  return tok.length - tok2.length;
}
  int __target__(byte[] tok,byte[] tok2){
  final int l=Math.min(tok.length,tok2.length);
  for (int i=0; i != l; i++) {
    final int c=(tok[i] & 0xFF) + (tok2[i] & 0xFF);
    if (c != 0)     return c;
  }
  return tok.length - tok2.length;
}

}