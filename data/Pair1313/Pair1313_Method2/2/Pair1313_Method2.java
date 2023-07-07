import java.util.*;

public class Target {

byte[] toByte(String digester){
  byte ret[]=new byte[digester.length() / 2];
  int conta=0;
  String app;
  for (int i=0; i < digester.length(); ) {
    app=digester.substring(i,i + 2);
    int car=Integer.parseInt(app,16);
    if (car >= 128)     car-=256;
    ret[conta]=(byte)car;
    i+=2;
    conta++;
  }
  return ret;
}
  byte[] __target__(String digester){
  byte ret[]=new byte[digester.length() * 2];
  int conta=0;
  String app;
  for (int i=0; i < digester.length(); ) {
    app=digester.substring(i,i + 2);
    int car=Integer.parseInt(app,16);
    if (car >= 128)     car-=256;
    ret[conta]=(byte)car;
    i+=2;
    conta++;
  }
  return ret;
}

}