public class even {
    public static void main(String[] args){
        for(int i=1; i<=10; i++)
        if (i%2==0){
            System.out.print(i);
            System.out.println(" even number");
        } 
        for(int i=0; i<=10; i++)
        if(i%2!=0){
            System.out.print(i);
            System.out.println(" odd number");
        }
    }
}