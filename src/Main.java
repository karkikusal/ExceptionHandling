public class Main {
    public static void main(String[] args) {

        try{
            int divider = 10;
            int value = 500;
            int result = value/divider;
            System.out.println("Result>>"+ result);

        }catch(ArithmeticException e) {
            System.out.println("Error message:" + e);
        }finally{
            System.out.println("Part of final");
        }




        //other works

        anotherwork();
        anotherwork();
        anotherwork();
        anotherwork();
    }

    static void  anotherwork(){
        System.out.println("anotherwork");
    }
}