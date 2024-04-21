public class Lab8_1 {

    public static void main (String[] args)  {
        try{
        int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x*y;
        
        System.out.println("x*y = "+z);
           }
            catch(Exception e)
        {
        e.printStackTrace();
        }
    }
}
public static int computePower(int x, int y) {
   
}