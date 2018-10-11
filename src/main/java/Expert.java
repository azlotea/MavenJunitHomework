public class Expert extends Basic {

//    public Expert(int floatingPoints) {
//        super(floatingPoints);
//    }

    public int pow(int numar, int exp) {
        //System.out.println("s-a folosit metoda int");
        int result = numar;
        if (exp == 0) {
            result = 1;
        }
//        if (exp == 1) {
//            result = numar;
        //}
        if (exp < 0){
            numar = (1/numar);
            exp = -exp;
        }
        for (int i = 1; i < exp; i++) {
            result = result * numar;
        }
        return result;
    }

    public double pow(double numar, int exp) {
        //System.out.println("s-a folosit metoda double");
        double result = numar;
        if (exp == 0) {
            result = 1;
        }
        if (exp == 1) {
            result = numar;
        }
        for (int i = 1; i < exp; i++) {
            result = result * numar;
        }
        return result;

    }
//    public int fact(int numar){
//        int factorial = 1;
//        for (int i = 1; i <= numar; i++){
//            factorial = factorial * i;
//    }
//    return factorial;
//    }

    public int fact(int numar){
        int factorial;
        if (numar == 0) {
            return 1;
        }
        else{
            factorial = numar * fact(numar-1);
        }
        return factorial;

    }
    public int sqrt(int numar){
        int radical = 1;
        if(numar < 0){
            numar = -numar;
        }
            while (radical * radical < numar) {
                radical = radical + 1;
            }
            return radical;

    }

}
