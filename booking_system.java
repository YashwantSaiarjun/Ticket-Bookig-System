import java.util.Scanner;
class boarding {
    public String boarding_point(){
        String boarding_point;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("BOARDING POINTS AVAILABE : beach,central,mount,tbm,chen");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("\nEnter your boarding point : ");
        boarding_point=sc.nextLine();
        return boarding_point;
    }
         
}

class destination extends boarding{
    public String des(String bp){
        String d;
        Scanner sc = new Scanner(System.in);
        if(bp.equals("beach")){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("DESTINATIONS AVAILABLE : central,mount,tbm,chen");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("\nEnter your destination : ");
            d=sc.nextLine();
        }
        else if(bp.equals("central")){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("DESTINATIONS AVAILABLE : beach,mount,tbm,chen");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("\nEnter your destination : ");
            d=sc.nextLine();
        }
        else if(bp.equals("mount")){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("DESTINATIONS AVAILABLE : beach,central,tbm,chen");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("\nEnter your destination : ");
            d=sc.nextLine();
        }
        else if(bp.equals("tbm")){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("DESTINATIONS AVAILABLE : beach,central,mount,chen");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("\nEnter your destination : ");
            d=sc.nextLine();
        }
        else if(bp.equals("chen")){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("DESTINATIONS AVAILABLE : beach,central,mount,tbm");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("\nEnter your destination : ");
            d=sc.nextLine();
        }
        else{
            d="none";
        }       
        return d;
                              
    }
}
class booking extends destination{
    public int passenger(){
        Scanner sc = new Scanner(System.in);
        int passenger;
        System.out.print("\nEnter the number of passenger :");
        passenger = sc.nextInt();
        return passenger;

    }
    public float book(String bp, String des, int passenger){
        float price=0;
        float total_price;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("Boarding point : "+bp+"               "+"Destination : "+des);
        System.out.println("\n");

        if(bp.equals("beach")){
            if(des.equals("central")){
                System.out.println("Ticket price: Rs 10");
                price=10;                
            }
            else if(des.equals("mount")){
                System.out.println("Ticket price: Rs 20");
                price=20;                
            }
            else if(des.equals("tbm")){
                System.out.println("Ticket price: Rs 30"); 
                price=30;               
            }
            else{
                System.out.println("Ticket price: Rs 40");   
                price=40;             
            }

        }

        if(bp.equals("central")){
            if(des.equals("beach")){
                System.out.println("Ticket price: Rs 10");
                price=10;                
            }
            else if(des.equals("mount")){
                System.out.println("Ticket price: Rs 10");
                price=10;                
            }
            else if(des.equals("tbm")){
                System.out.println("Ticket price: Rs 20"); 
                price=20;               
            }
            else{
                System.out.println("Ticket price: Rs 30");   
                price=30;             
            }
            
        }

        if(bp.equals("mount")){
            if(des.equals("beach")){
                System.out.println("Ticket price: Rs 20");
                price=20;                
            }
            else if(des.equals("central")){
                System.out.println("Ticket price: Rs 10");
                price=10;                
            }
            else if(des.equals("tbm")){
                System.out.println("Ticket price: Rs 10"); 
                price=10;               
            }
            else{
                System.out.println("Ticket price: Rs 20");   
                price=20;             
            }
            
        }

        

        if(bp.equals("tbm")){
            if(des.equals("beach")){
                System.out.println("Ticket price: Rs 30");
                price=30;                
            }
            else if(des.equals("central")){
                System.out.println("Ticket price: Rs 20");
                price=20;                
            }
            else if(des.equals("mount")){
                System.out.println("Ticket price: Rs 10"); 
                price=10;               
            }
            else{
                System.out.println("Ticket price: Rs 10");   
                price=10;             
            }
            
        }

        if(bp.equals("chen")){
            if(des.equals("beach")){
                System.out.println("Ticket price: Rs 40");
                price=40;                
            }
            else if(des.equals("central")){
                System.out.println("Ticket price: Rs 30");
                price=30;                
            }
            else if(des.equals("mount")){
                System.out.println("Ticket price: Rs 20"); 
                price=20;               
            }
            else{
                System.out.println("Ticket price: Rs 10");   
                price=10;             
            }
            
        }
        
        total_price=passenger*price;
        System.out.println("\nTOTAL PRICE : "+total_price);
        return total_price;
    }
}

class ticket_print extends booking{
    public void print_ticket(String bp,String des,float price,int passenger){
        System.out.println("\n\n\n");
        System.out.println("###################################################################");
        System.out.println("    Boarding point: "+bp+"                 Destination: "+des);
        System.out.println("    No of passenger: "+passenger);
        System.out.println("    Total price : Rs "+price);
        System.out.println("###################################################################");
    }
    

}


class booking_system extends ticket_print{
    public static void main(String[] args) {
        booking_system obj=new booking_system();
        float total_price;
        char print;
        int passenger;
        String boarding_point,destination;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                       TICKET BOOKING SYSTEM                       ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n               WELCOME THERE...! BOOK YOUR TICKETS...!           ");
        boarding_point=obj.boarding_point();
        destination=obj.des(boarding_point);
        passenger=obj.passenger();
        total_price=obj.book(boarding_point,destination,passenger);
        System.out.print("\nPress \'P\' to print ticket : ");
        print=sc.next().charAt(0);
        if(print=='p' || print=='P'){
            System.out.println("printing......");
            try {
            Thread.sleep(5000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.print_ticket(boarding_point,destination,total_price,passenger);
        }
    }

}
