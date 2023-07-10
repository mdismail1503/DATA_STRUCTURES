import java.util.HashMap;

public class Fib {

    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        System.out.println(fib(6,map));

    }
    static int fib(int n,HashMap<Integer,Integer> memo){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        if(!memo.containsKey(n)){
            memo.put(n,fib(n-1,memo)+fib(n-2,memo));
        }
        return  memo.get(n);
    }
}
