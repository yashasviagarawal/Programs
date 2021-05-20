public class Program2 {
    public static void main(String agrs[])
    {
        for(int i = 0; i<5; i++){
            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
                if(i==3 && j==1){
                    break;
                }

            }
            System.out.println();
        }
    }
}
