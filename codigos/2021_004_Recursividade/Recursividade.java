public class Recursividade {

    public static int fatorial(int num){
        if (num <= 1)
            return 1;
        else {
            int result_fat_ant = fatorial(num - 1);
            return num * result_fat_ant;
        }
    }

    public static int fibonacci(int i){
        if (i<=1)
            return 1;
        else{
            int fibo1 = fibonacci(i-1);
            int fibo2 = fibonacci(i-2);
            return fibo1+fibo2;
            //return fibonacci(i-1)+fibonacci(i-2)
        }
    }

    public static void main(String[] args) {
        int val = 5;
        int fat = fatorial(val);
        System.out.println("Fatorial de "+val+" : "+fat);

        int fibo = fibonacci(4);
        System.out.println("Fibonacci: "+fibo);
    }
}
