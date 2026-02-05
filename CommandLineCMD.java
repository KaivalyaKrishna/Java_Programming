public class CommandLineCMD {
	
	public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
            System.out.println("Length: " + args[1].length());
        }
       int sum=0;
        sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        
        System.out.println();
        System.out.println(sum);
    }
}
