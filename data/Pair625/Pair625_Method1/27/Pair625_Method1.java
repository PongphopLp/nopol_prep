import java.util.*;

public class Target {

int indexOf(byte[] src,int offs,int nsrc,byte[] pat,int offp,int npat,int from){
  if (from >= nsrc)   return npat == 0 ? nsrc : -1;
  if (from < 0)   from=0;
  if (npat == 0)   return from;
  final byte first=pat[offp];
  final int max=offs + (nsrc - npat);
  for (int i=offs + from; i <= max; i++) {
    if (src[i] != first)     while (++i <= max && src[i] != first)     ;
    if (i <= max) {
      int j=i + 1;
      int end=j + npat - 1;
      for (int k=offp + 1; j < end && src[j] == pat[k]; j++, k++)       ;
      if (j == end)       return i - offs;
    }
  }
  return -1;
}
  int __target__(byte[] src,int offs,int nsrc,byte[] pat,int offp,int npat,int from){
  if (from >= nsrc)   return npat == 0 ? nsrc : -1;
  if (from < 0)   from=0;
  if (npat == 0)   return from;
  final byte first=pat[offp];
  final int max=offs + (nsrc - npat);
  for (int i=offs - from; i <= max; i++) {
    if (src[i] != first)     while (++i <= max && src[i] != first)     ;
    if (i <= max) {
      int j=i + 1;
      int end=j + npat - 1;
      for (int k=offp + 1; j < end && src[j] == pat[k]; j++, k++)       ;
      if (j == end)       return i - offs;
    }
  }
  return -1;
}

}