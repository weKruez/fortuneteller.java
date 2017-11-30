import java.util.*;


public class fortuneteller {
    //One of the first programs I designed based on the popular Middle School game "Fortune Teller" tradiationally made of paper
    
	public static void main(String[] args) {
		
        Scanner in = new Scanner (System.in);
        
        System.out.println("Pick a color: red, blue, green, or yellow");
        String color = in.nextLine();
			int num1 = 1;
			int pick1 = 0;
                if (color.equals("red")) {
                    pick1 = num1 * 3;
                } else if (color.equals("blue")) {
				pick1 = num1 * 4;
                } else if (color.equals("green")) {
                    pick1 =	num1 * 5;
                } else if (color.equals("yellow")) {
                    pick1 = num1 * 6;
                } else {
                    throw new IllegalArgumentException("Wrong input!");
                }
		
                if (num1%2 == 0) {
                    System.out.println("Choose a number from 1, 2, 5, 6");

                } else if (num1%2 != 0) {
                    System.out.println("Choose a number from 3, 4, 7, 8");
				
                } else {
                    throw new IllegalArgumentException("Wrong input!");
                }
			
                int pick2 = in.nextInt();
				if (pick2==1 || pick2==2 || pick2==6 || pick2==3 || pick2==7 || pick2==8) {
                    System.out.println("Choose a number from 1, 2, 5, 6");
                } else if (pick2==4 || pick2==5) {
                    System.out.println("Choose a number from 3, 4, 7, 8");
                } else {
                    throw new IllegalArgumentException("Wrong input!");
                    }
            int fortune = in.nextInt();
			if (fortune == 1) {
                    System.out.println("You have some troubling news ahead...");
                } else if (fortune == 2){
                    System.out.println("You will meet a new friend soon...");
                } else if (fortune == 3) {
                    System.out.println("Your fortune will increase...");
                } else if (fortune == 4) {
                    System.out.println("You are loved...");
                } else if (fortune == 5) {
                    System.out.println("You will have great luck!");
                } else if (fortune == 6) {
                    System.out.println("A dark force is conspiring against you...");
                } else if (fortune == 7) {
                    System.out.println("Today will be a great day!");
                } else if (fortune == 8) {
                    System.out.println("Someone needs you...");
                }
			
	}
}
