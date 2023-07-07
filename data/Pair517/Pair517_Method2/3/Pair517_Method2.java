import java.util.*;

public class Target {

String nomImage(int nb){
  String res="";
  if (nb < 10)   res="000";
 else   if (nb < 100)   res="00";
 else   if (nb < 1000)   res="0";
  return res + nb;
}
  String __target__(int nb){
  String res="";
  if (nb < 10)   res="000";
 else   if (nb < 100)   res="00";
 else   if (nb <= 1000)   res="0";
  return res + nb;
}

}