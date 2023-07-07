import java.util.*;

public class Target {

String conv2Html(int i){
  if (i == '&')   return "&amp;";
 else   if (i == '<')   return "&lt;";
 else   if (i == '>')   return "&gt;";
 else   if (i == '"')   return "&quot;";
 else   return "" + (char)i;
}
  String __target__(int i){
  if (i == '&')   return "&amp;";
 else   if (i == '<')   return "&lt;";
 else   if (i == '>')   return "&gt;";
 else   if (i != '"')   return "&quot;";
 else   return "" + (char)i;
}

}