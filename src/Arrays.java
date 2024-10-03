public class Arrays {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] == 30){
                System.out.println("Nº " + numbers[i]);
            }
        }

        int cont = 0;
        boolean val = false;
        while(cont < numbers.length && !val){
            if (numbers[cont] == 30){
                val = true;
            }else {
                System.out.println("Nº " + numbers[cont]);
                cont++;
            }
        }

        int[][] matriz = {
            {1, 2, 3 ,4},
            {5, 6, 7},
            {8, 9, 10}
        };

        for(int[] uni : matriz){
            for(int num : uni){
                System.out.println(num);
            }
        }

        int int1 = 0;

        boolean stop = false;
        while(int1 < matriz.length && !stop){
            int int2 = 0;
            while(int2 < matriz[int1].length &&!stop){

                if (matriz[int1][int2] == 7){
                    stop = true;
                }
                else{
                    System.out.println("Nº " + matriz[int1][int2]);
                    int2++;
                }
            }
            int1++;
        }
    }
}
