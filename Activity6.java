import java.util.Scanner;

public class Programming{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter gross salary:");
        int gs = seanner.nextInt();
        int td = Programming.TaxDue(gs);
        System.out.println("text:"+ td);
    }
    public static int Tax(int gs){
    int c;
        if (gs<=50000){
            gs = (int)(gs*(10.0f/100.0f));
        }
        else if (gs > 50000){
            if(gs <=100000){
                c = gs-50000;
                gs = (int)(c*(15.0f))+50000;
            }     
            else if(gs <=200000){
                c = gs-100000;
                gs = (int)(c*(20.0f/100.0f))+15000:
            }
            else if(gs>200000){
                gs = (int)(gs*(20.0f/100.0f));
            }
        }
        return gs
    }
}
            }
            }
        }
        }    }   }
}
    
}
