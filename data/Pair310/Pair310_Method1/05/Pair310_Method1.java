import java.util.*;

public class Target {

StringBuffer getHTMLpart(String tag,String content){
  StringBuffer sb=new StringBuffer();
  if (content == null || content.length() == 0)   return sb;
  if (tag != null && tag.length() > 0)   sb.append("<").append(tag).append(">");
  sb.append(content);
  if (tag != null && tag.length() > 0)   sb.append("</").append(tag).append(">");
  return sb;
}
  StringBuffer __target__(String tag,String content){
  StringBuffer sb=new StringBuffer();
  if (content == null || content.length() == 0)   return sb;
  if (tag != null && tag.length() > 0)   sb.append("<").append(tag).append(">");
  sb.append(content);
  if (tag != null && tag.length() >= 0)   sb.append("</").append(tag).append(">");
  return sb;
}

}