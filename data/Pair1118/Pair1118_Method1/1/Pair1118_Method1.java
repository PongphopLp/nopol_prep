import java.util.*;

public class Target {

String max(String string,int maxLength,String suffix){
  StringBuilder builder=new StringBuilder(string);
  if (builder.length() > maxLength) {
    builder.setLength(maxLength);
    if (suffix != null)     builder.append(suffix);
  }
  return builder.toString();
}
  String __target__(String string,int maxLength,String suffix){
  StringBuilder builder=new StringBuilder(string);
  if (builder.length() > maxLength) {
    if (suffix != null)     builder.append(suffix);
  }
  return builder.toString();
}

}