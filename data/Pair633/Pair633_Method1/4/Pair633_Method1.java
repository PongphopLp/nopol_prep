import java.util.*;

public class Target {

String order(int x){
  if (x == 1)   return "1st";
 else   if (x == 2)   return "2nd";
 else   if (x == 3)   return "3rd";
 else   return x + "th";
}
  String __target__(int x){
  if (x == 1)   return "1st";
 else   if (x == 2)   return "2nd";
 else   if (x != 3)   return "3rd";
 else   return x + "th";
}

}