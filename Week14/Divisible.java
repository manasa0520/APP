public class Divisible {

        public static void main(String[] args) {
            int start = 1000;
            int end = 2000;
            
            for(int i_010 = start; i_010 <=end ;i_010++){
                if( i_010 % 8== 0 && i_010 %5 == 0){
                    System.out.println(i_010);
                }
            }
        }
    }
    