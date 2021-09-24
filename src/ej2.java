public class ej2 {
    public static void main(String[] args) {
        int nProcesos=27;
        int incrProceso=1;
        int numHebr=5;
        int numPpH=(int) Math.ceil((double)nProcesos / numHebr);;
        int hebInic=0;
        int i=0+hebInic*numPpH;
//        int mId{0,1,2,3};
        for(int j=0;j<numHebr;j++){
            hebInic=j;
            for(int x = 0; x<numPpH; x+=incrProceso){
                if(i==nProcesos){
                    break;
                }
                System.out.println(i);
                i++;
            }
            System.out.println("-");
        }


    }
}
