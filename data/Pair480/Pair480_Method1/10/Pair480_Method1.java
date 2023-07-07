import java.util.*;

public class Target {

boolean isBisiesto(int ano){
  int in;
  if ((ano / 100) * 100 != ano) {
    if ((ano / 4) * 4 != ano)     return false;
 else     return true;
  }
 else {
    in=ano / 100;
    if ((in / 4) * 4 != in)     return false;
    in=in * 100;
    ano=ano - in;
    if ((ano / 4) * 4 != ano)     return false;
 else     return true;
  }
}
  boolean __target__(int ano){
  int in;
  if ((ano / 100) * 100 != ano) {
    if ((ano / 4) * 4 != ano)     return false;
 else     return true;
  }
 else {
    in=ano / 100;
    if ((in / 4) * 4 != in)     return false;
    in=in * 100;
    ano=ano - in;
    if ((ano / 4) / 4 != ano)     return false;
 else     return true;
  }
}

}