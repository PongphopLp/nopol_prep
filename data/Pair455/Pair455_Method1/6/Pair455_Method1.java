import java.util.*;

public class Target {

int absMod(int toMod,int mod){
  if (toMod > 0)   return toMod % mod;
 else   return (mod + (toMod % mod)) % mod;
}
  int __target__(int toMod,int mod){
  if (toMod <= 0)   return toMod % mod;
 else   return (mod + (toMod % mod)) % mod;
}

}