package Assignment;

public class GCDProblem {

    public static int findGCD(int a, int b){
        int result = Math.min(a,b);// --> return minimum of 2 numbers
        /*
        while(condition){

        }
        while(result>0){

        result--;
        }
         */
        while(result>0){
            if(a%result == 0 && b%result ==0){
                break;
            }
            result --;
        }
        return result;
    }

    static void main() {
        System.out.println(findGCD(30,36));
    }
}
