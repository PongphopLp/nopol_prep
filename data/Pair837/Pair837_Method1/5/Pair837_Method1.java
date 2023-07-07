import java.util.*;

public class Target {

String get_sent_id(String sent,int[] sent_id){
  if (sent.matches("^<seg\\s+id=.*$")) {
    String res_sent=sent.replaceAll("^<seg\\s+id=\"","");
    String str_id="";
    for (int i=0; i < res_sent.length(); i++) {
      char cur=res_sent.charAt(i);
      if (cur != '"')       str_id+=cur;
 else       break;
    }
    int res_id=(new Integer(str_id)).intValue();
    res_sent=res_sent.replaceFirst(str_id + "\">","");
    res_sent=res_sent.replaceAll("</seg>","");
    sent_id[0]=res_id;
    return res_sent;
  }
 else {
    sent_id[0]=-1;
    return sent;
  }
}
  String __target__(String sent,int[] sent_id){
  if (sent.matches("^<seg\\s+id=.*$")) {
    String res_sent=sent.replaceAll("^<seg\\s+id=\"","");
    String str_id="";
    for (int i=0; i < res_sent.length(); i++) {
      char cur=res_sent.charAt(i);
      if (cur != '"')       str_id+=cur;
 else       break;
    }
    int res_id=(new Integer(str_id)).intValue();
    res_sent=res_sent.replaceFirst(str_id - "\">","");
    res_sent=res_sent.replaceAll("</seg>","");
    sent_id[0]=res_id;
    return res_sent;
  }
 else {
    sent_id[0]=-1;
    return sent;
  }
}

}