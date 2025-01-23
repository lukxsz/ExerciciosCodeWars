public class Main {
    public static void main(String[] args) {
        double[] sum = {-2.398};
        double soma = 0;
        if (sum != null){
            for(int i =0; i<sum.length; i++){
                soma += sum[i];
            }
            System.out.println(+soma);
        }
    }
}