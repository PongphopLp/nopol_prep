import java.util.*;

public class Target {

boolean isIPBanned(String[] bannedIPList,String ipAddress){
  if (bannedIPList == null) {
    return false;
  }
  for (int i=0; i < bannedIPList.length; i++) {
    String bannedIP=bannedIPList[i];
    if (ipAddress.matches(bannedIP)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] bannedIPList,String ipAddress){
  if (bannedIPList == null) {
    return false;
  }
  for (int i=0; i < bannedIPList.length; i--) {
    String bannedIP=bannedIPList[i];
    if (ipAddress.matches(bannedIP)) {
      return true;
    }
  }
  return false;
}

}