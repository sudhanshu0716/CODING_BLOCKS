public class pattern4{
        public static void main(String[]args){
          int row=1;
          int star=1;
          while(row<=5){
            int i=5;
            while(i>=row){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            row++;
          }
              
     }
    
    
}

