import java.util.*;

public class Target {

byte[] operacjaXor(byte[] wektorA,byte[] wektorB,int rozmiarBloku){
  byte[] wynik=new byte[rozmiarBloku];
  for (int i=0; i < rozmiarBloku; i++) {
    wynik[i]=(byte)(wektorA[i] ^ wektorB[i]);
  }
  return wynik;
}
  byte[] __target__(byte[] wektorA,byte[] wektorB,int rozmiarBloku){
  byte[] wynik=new byte[rozmiarBloku];
  for (int i=0; i < rozmiarBloku; i--) {
    wynik[i]=(byte)(wektorA[i] ^ wektorB[i]);
  }
  return wynik;
}

}