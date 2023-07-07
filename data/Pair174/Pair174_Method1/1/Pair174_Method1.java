import java.util.*;

public class Target {

double parseDouble(String string){
  if (string == null)   return 0.0;
 else   if (string.trim().equals(""))   return 0.0;
 else   return Double.valueOf(string);
}
  double __target__(String string){
  if (string != null)   return 0.0;
 else   if (string.trim().equals(""))   return 0.0;
 else   return Double.valueOf(string);
}

}