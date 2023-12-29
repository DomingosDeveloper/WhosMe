public class secondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3954));
        System.out.println(getDurationString(65, 43));
    }
        public static String getDurationString(int segundos){

            int minutos = segundos / 60;
            
            return getDurationString(minutos, segundos);
        }
        public static String getDurationString (int segundos, int minutos){

        int horas = minutos / 60;

        int minutosRestantes = minutos % 60;
        int segundosRestantes = segundos % 60;

        return horas + "h " + minutosRestantes + "m " + segundosRestantes + "s";
        }

}
