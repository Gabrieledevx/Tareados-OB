public class main {

    public static void main(String args[]){

        System.out.println("Tarea - OpenBootcamp");
        System.out.println("Tema 4");

        posneg(2);
        buclewhile();
        bucledowhile();
        buclefor();
        usoswitch();

    }

    public static void posneg(int num){
        if(num<0){
            System.out.println("Es un numero negativo");
        }
        else if (num>0){
            System.out.println("Es un numero positivo");
        }
    }

    public static void buclewhile(){
        int numerowhile=0;
        while(numerowhile<3){
            numerowhile++;
            System.out.println("->"+numerowhile);
        }
    }

    public static void bucledowhile(){
        int numerodowhile=0;
        do{
            numerodowhile++;
            System.out.println("->"+numerodowhile);
        }
        while(numerodowhile<1);
    }

    public static void buclefor(){

        for(int numerofor=0;numerofor<=3;numerofor++){
            System.out.println("variable:"+numerofor);
        }
    }

    public static void usoswitch(){
        //Ejemplo para que muestre invierno
        int opcion=2;
        String estacion="";
        switch (opcion)
        {
            case 1:  estacion = "verano";
                System.out.println("Se encuenta en al estacion: "+estacion);
                break;
            case 2:  estacion = "invierno";
                System.out.println("Se encuenta en al estacion: "+estacion);
                break;
            case 3:  estacion = "otonio";
                System.out.println("Se encuenta en al estacion: "+estacion);
                break;
            case 4:  estacion = "primavera";
                System.out.println("Se encuenta en al estacion: "+estacion);
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }

}
