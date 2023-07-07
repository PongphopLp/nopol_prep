import java.util.*;

public class Target {

String toHtml(int i){
  if (i == 38)   return "&amp;";
  if (i == 60)   return "&lt;";
  if (i == 62)   return "&gt;";
  if (i == 34)   return "&quot;";
 else   return (new StringBuilder()).append("").append((char)i).toString();
}
  String __target__(int i){
  if (i == 38)   return "&amp;";
  if (i == 60)   return "&lt;";
  if (i == 62)   return "&gt;";
  if (i != 34)   return "&quot;";
 else   return (new StringBuilder()).append("").append((char)i).toString();
}

}