public class Basic {

    int floatingPoints;

//    public Basic(int floatingPoints) {
//        this.floatingPoints = floatingPoints;
//    }

    public int add(int... aParam){
        int sum = 0;
        for (int i = 0; i < aParam.length; i++){
            sum = sum + aParam[i];
        }
        return sum;
    }
    public long add(long... aParam) {
        long sum = 0;
        for (int i = 0; i < aParam.length; i++) {
            sum = sum + aParam[i];
        }
        return sum;
    }
    public double add(double... aParam) {
        double sum = 0;
        for (int i = 0; i < aParam.length; i++) {
            sum = sum + aParam[i];

        }
        return sum;
    }
    public int sub(int... subParam){
        int sub = subParam[0];
        for (int i = 1; i < subParam.length; i++){
            sub = sub - subParam[i];
        }
        return sub;
    }
    public long sub(long... subParam){
        long sub = subParam[0];
        for (int i = 1; i < subParam.length; i++){
            sub = sub - subParam[i];
        }
        return sub;
    }
    public double sub(double... subParam){
        double sub = subParam[0];
        for (int i = 1; i < subParam.length; i++) {
            sub = sub - subParam[i];
        }
        return sub;
    }
    public int mlt(int... mltParam){
        int mlt = 1;
        for (int i = 0; i < mltParam.length; i++){
            mlt = mlt * mltParam[i];
        }
        return mlt;
    }
    public long mlt(long... mltParam) {
        long mlt = 1;
        for (int i = 0; i < mltParam.length; i++) {
            mlt = mlt * mltParam[i];
        }
        return mlt;
    }
    public double mlt(double... mltParam) {
        double mlt = 1;
        for (int i = 0; i < mltParam.length; i++) {
            mlt = mlt * mltParam[i];
        }
        return mlt;
    }
    public double div(int... divParam){
       // System.out.println("s a apelat metoda int");
        double div = divParam[0];
        if (divParam[0] == 0){
            return 0;
        }
        for (int i = 1; i < divParam.length; i++) {
            if (divParam[i] == 0){
                throw new ArithmeticException("Numarul este : " + divParam[i]);
            }
            else {
                div = div / divParam[i];
            }
        }
        return div;
    }

    public double div(long... divParam){
        //System.out.println("s a apelat metoda long");
        double div = divParam[0];
        if (divParam[0] == 0) {
            return 0;
        }

        for (int i = 1; i < divParam.length; i++) {
            if (divParam[i] == 0) {
                throw new ArithmeticException("Numarul este : " + divParam[i]);
            }
            else {
                div = div / divParam[i];
            }
        }
        return div;
    }
    public double div(double... divParam){
        //System.out.println("s a apelat double");
        double div = divParam[0];
        if(divParam[0] == 0) {
            return 0;
        }

        for (int i = 1; i < divParam.length; i++) {
            if (divParam[i] == 0) {
                throw new ArithmeticException("Numarul este : " + divParam[i]);
            }
            else {
                div = div / divParam[i];
            }
        }
        return div;
    }

}
