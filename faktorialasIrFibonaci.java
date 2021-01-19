package rekursija;

public class Rekursija {
    
    public static int fakt(int sk) { //per metoda
        if(sk < 0) { //patikrinimas nuo neigiamu skaiciu
            return -1;
        }
        if (sk == 0) { // ,kad skaiciuotu iki 0
            return 1;
        }
        return sk * fakt(sk - 1);
    }
    
    public static void fib(long sk1, long sk2, long max) { //metodas tik spausdina
        System.out.println("Fibonacci skaiciu seka iki "+max+ ":");
        System.out.println(sk1);
        
        while(sk2 <= max){
            long sum = sk1 + sk2;
            sk1 = sk2;
            sk2 = sum;
            System.out.println(sk1);
            
        }
    }
    
    public static void main(String[] args) {
        int f = fakt(4);
        System.out.println(f);
        
        fib(1,1, 1000);
        /*
        1
        1
        2
        3
        5
        8
        13
        21
        */
        
        /*
        int sk = 4;
        int f = 1;
        for (int i = sk; i >= 1; i--) {
            f *= i;
        }
        System.out.println(f);
*/
}
}
