public class Main {
    public static void main(String[] args) {
        int[] sequencia = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};
        int divisor = 3;
        
        for(int num : sequencia){
            if(num % divisor == 0){
                System.out.println("PIN");
            }else{
                System.out.println(num);
            }
        }

    }
}