public class ej1 {
    public static void main(String[] args) {
        int nProcesos=24;
        int numHebras=4;
//        int mId{0,1,2,3};
        for(int x = 0; x<nProcesos; x+=numHebras){
            System.out.println(x);
        }
    }
}
