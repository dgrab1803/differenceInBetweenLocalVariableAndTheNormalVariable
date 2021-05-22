package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        MyFunc<Long> myLambda = (n) -> {
            long wynik =1;

            for(long i=n; i >0; i--){
                wynik *=i;
            }

            return wynik;
        };

        System.out.println("silnia z liczby 3 wynosi " + myLambda.func(3L) );

    }
}
