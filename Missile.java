import java.util.Scanner;

public class Missile {
    Scanner sc = new Scanner(System.in);

    String serialNumber;
    String target;
    String status;
    
    public void selecTarget() {
        status = "stand by";
        System.out.println("Missle on " + status + " for firing");
        System.out.println("Please enter a target location: ");
            target = sc.nextLine();
            while (target == null||target.equals("")){
                System.out.println("Invalid. Please enter a target location: ");
                target = sc.nextLine();
            }
        System.out.println("Target "+ target + " selected");   
    }
    public void fire()throws InterruptedException{
            if(target == null){
                System.out.println("Select target first.");
                selecTarget();
                System.out.println("missile take-off count down in.");

                System.out.println("3");
                    Thread.sleep(1000);

                System.out.println("2");
                    Thread.sleep(1000);

                System.out.println("1");
                    Thread.sleep(1000);

                System.out.println("Missile has been launched");
                    Thread.sleep(1000);
                    status = "mobilized";
                System.out.println("missile is on the way!");
                    Thread.sleep(1000);
                    
                System.out.println("Impact detection");   
                    Thread.sleep(1000);
                    status = "detonated";

                System.out.println("Target neutralized");
            }    
            else{
                System.out.println("Target "+ target + " selected");
                System.out.println("Missile firing in ");
                
                System.out.println("3");
                    Thread.sleep(1000);

                System.out.println("2");
                    Thread.sleep(1000);

                System.out.println("1");
                    Thread.sleep(1000);

                System.out.println("Missile has been launched");
                    Thread.sleep(1000);
                    status = "mobilized";

                System.out.println("Impact detection");   
                    Thread.sleep(1000);
                    status = "detonated";

                System.out.println("Target neutralized");
            }
                
        }         
    public static void main(String[]args)  throws InterruptedException{
       Missile Missile = new Missile();
        Missile.serialNumber = "VF-12473T1";
        Missile.fire();
    }      
}


