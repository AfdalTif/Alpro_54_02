 public static void main(String[] args) {
     int input = 10;

     for (int i = 2; i < input; i++) {
         boolean isPrima = true;

         for (int j = 2; j < i; j++) {
             if(i%j==0){
                 isPrima = false;
                 break;
             }
         }

         if(isPrima==true){
         System.out.println(i+",");
    }
  }
 }
}