public class Main {
    public static void main(String[] args) {
        int [] numbers = {-6,-2,-1,-8,-10};
        int maior = -1000000;
        int menor = 0;
        int soma = 0;
        if( numbers == null || numbers.length <=1){
            System.out.println("0");

        }else{
            for(int i =0; i< numbers.length; i++){
                soma += numbers[i];
                if (numbers[i]>maior){
                    maior = numbers[i];
                }
            }
            menor = maior;
            System.out.println(+maior);
            for(int i =0; i< numbers.length; i++){
                if (numbers[i]< menor){
                    menor = numbers[i];
                }
            }
            soma = soma - (maior+menor);
        }
        System.out.println(+menor);
        System.out.println(+maior);
        System.out.println(+soma);
    }
}
