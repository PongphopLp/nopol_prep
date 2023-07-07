import java.util.*;

public class Target {

Object sh_echo(String[] argv){
  StringBuffer strbuf;
  boolean lf;
  int n;
  int i;
  if (argv == null) {
    System.out.println("USAGE: echo [[-n] <string>]\n" + "       Echoes the <string> to the output.\n" + "       Parameter \"-n\" supressed the newline\n"+ "       at the end of the output.");
    return null;
  }
  strbuf=new StringBuffer();
  lf=true;
  n=0;
  if (argv.length > 1 && argv[0] != null && argv[0].equals("-n")) {
    lf=false;
    n++;
  }
  for (i=n; i < argv.length - 1; i++) {
    strbuf.append(argv[i] + " ");
  }
  if (argv.length > 0) {
    strbuf.append(argv[argv.length - 1]);
  }
  if (lf) {
    strbuf.append("\n");
  }
  System.out.print(strbuf.toString());
  return strbuf.toString();
}
  Object __target__(String[] argv){
  StringBuffer strbuf;
  boolean lf;
  int n;
  int i;
  if (argv == null) {
    System.out.println("USAGE: echo [[-n] <string>]\n" + "       Echoes the <string> to the output.\n" + "       Parameter \"-n\" supressed the newline\n"+ "       at the end of the output.");
    return null;
  }
  strbuf=new StringBuffer();
  lf=true;
  n=0;
  if (argv.length > 1 && argv[0] == null && argv[0].equals("-n")) {
    lf=false;
    n++;
  }
  for (i=n; i < argv.length - 1; i++) {
    strbuf.append(argv[i] + " ");
  }
  if (argv.length > 0) {
    strbuf.append(argv[argv.length - 1]);
  }
  if (lf) {
    strbuf.append("\n");
  }
  System.out.print(strbuf.toString());
  return strbuf.toString();
}

}