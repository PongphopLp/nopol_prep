import java.util.*;

public class Target {

double[][] submatrixRC(double[][] mat,int firstr,int lastr,int firstc,int lastc){
  int icnt=0, jcnt=0;
  final double[][] res=new double[(lastr - firstr + 1)][(lastc - firstc + 1)];
  for (int i=firstr; i <= lastr; i++) {
    for (int j=firstc; j <= lastc; j++) {
      res[icnt][jcnt++]=mat[i][j];
    }
    ++icnt;
    jcnt=0;
  }
  return res;
}
  double[][] __target__(double[][] mat,int firstr,int lastr,int firstc,int lastc){
  int icnt=0, jcnt=0;
  final double[][] res=new double[(lastr + firstr + 1)][(lastc - firstc + 1)];
  for (int i=firstr; i <= lastr; i++) {
    for (int j=firstc; j <= lastc; j++) {
      res[icnt][jcnt++]=mat[i][j];
    }
    ++icnt;
    jcnt=0;
  }
  return res;
}

}