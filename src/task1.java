import java.util.*;
class task1
{
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        String name, username, password, landline_no, email, choice, address, phone_number, valid_from,valid_till;
        boolean sendEmail;
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your username");
        username = sc.next();
        System.out.println("Enter your password");
        password = sc.next();
        System.out.println("Enter your Landline Number");
        landline_no = sc.nextLine();

        System.out.println("Would you like to recieve emails? (Yes/No)");
        choice = sc.next().toLowerCase().trim();
        if(choice.equalsIgnoreCase("Yes"))
            sendEmail=true;
        else
            sendEmail = false;
        System.out.println("Enter your email id");
        email = sc.next();
        System.out.println("Enter your Address");
        address = sc.nextLine();
        System.out.println("Enter your Phone number");
        phone_number = sc.nextLine();

        int d1, d2, m1, m2, y1, y2;

        System.out.println("Enter the date from which it is valid from (dd/mm/yy)");
        valid_from = sc.nextLine();
        d1 = Integer.parseInt(valid_from.substring(0,2));
        m1 = Integer.parseInt(valid_from.substring(3,5));
        y1 = Integer.parseInt(valid_from.substring(6));
        System.out.println("Enter the date from which it is valid till (dd/mm/yy)");
        valid_till = sc.nextLine();
        d2 = Integer.parseInt(valid_till.substring(0,2));
        m2 = Integer.parseInt(valid_till.substring(3,5));
        y2 = Integer.parseInt(valid_till.substring(6));


        //Output
        System.out.println("Name: " + name +"\nUsername: " + username + "\nPassword: " + password + "\nLandline Number: " + landline_no
                + "\nEmail preferenc: " + choice + "\nEmail: " + email + "\nAddress: " + "\nPhone Number: " + phone_number + "\nValid From: "
                + valid_from + "\nValid Till: " + valid_till);

        System.out.println("Enter 0 to exit");
        if(sc.next().charAt(0) == '0')
            System.exit(0);
    }
}
