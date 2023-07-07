import java.util.*;

public class Target {

String convertString(byte[] _b,int _o,int _l){
  int i;
  for (i=_o; i < _o + _l; i++)   if (_b[i] == 0)   break;
  return new String(_b,_o,i - _o);
}
  String __target__(byte[] _b,int _o,int _l){
  int i;
  for (i=_o; i <= _o + _l; i++)   if (_b[i] == 0)   break;
  return new String(_b,_o,i - _o);
}

}