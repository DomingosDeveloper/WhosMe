public class cmsConvert {

    public static void main(String[] args) {
    System.out.println("O retorno de polegadas para centimetros é: " + paraCms(544) + " cms.");
    System.out.println("O retorno de polegadas e pés para centimetros é: " + paraCms(544, 543) + " cms.");

    }

    public static double paraCms (int inchs){
        return inchs * 30.4;
    }

    public static double paraCms (int inchs, int feet){
        return ((feet * 12) + inchs) * 30.4; //Temos que converter feet para inch: feet * 12.
    }
}
