import java.util.*;

public class Target {

boolean isXMLExtender(char c){
  if (c < 0x00B6)   return false;
  if (c == 0x00B7)   return true;
  if (c == 0x02D0)   return true;
  if (c == 0x02D1)   return true;
  if (c == 0x0387)   return true;
  if (c == 0x0640)   return true;
  if (c == 0x0E46)   return true;
  if (c == 0x0EC6)   return true;
  if (c == 0x3005)   return true;
  if (c < 0x3031)   return false;
  if (c <= 0x3035)   return true;
  if (c < 0x309D)   return false;
  if (c <= 0x309E)   return true;
  if (c < 0x30FC)   return false;
  if (c <= 0x30FE)   return true;
  return false;
}
  boolean __target__(char c){
  if (c < 0x00B6)   return false;
  if (c == 0x00B7)   return true;
  if (c == 0x02D0)   return true;
  if (c == 0x02D1)   return true;
  if (c == 0x0387)   return true;
  if (c == 0x0640)   return true;
  if (c == 0x0E46)   return true;
  if (c == 0x0EC6)   return true;
  if (c == 0x3005)   return true;
  if (c < 0x3031)   return false;
  if (c < 0x3035)   return true;
  if (c < 0x309D)   return false;
  if (c <= 0x309E)   return true;
  if (c < 0x30FC)   return false;
  if (c <= 0x30FE)   return true;
  return false;
}

}