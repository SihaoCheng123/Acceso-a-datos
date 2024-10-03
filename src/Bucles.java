public class Bucles {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println("Nº" + i);
        }

        int j = 0;
        boolean exit = false;
        while(j < 5 && !exit){
            System.out.println("J = " + j);
            if (j == 3) {
                exit = true;
            }
            j++;
        }
        int k = 0;
        do{
            System.out.println("Nº " + k);
            k++;
        }
        while(k < 3);

    }
}
