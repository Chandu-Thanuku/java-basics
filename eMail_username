 import java.util.Scanner;

class email {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Email: ");
        String email=input.nextLine();
        if(email.contains("@")){
            String user=email.substring(0,email.indexOf("@"));
            System.out.printf("Your User_name= %s\n",user);
            String domain=email.substring(email.indexOf("@")+1);
            System.out.printf("Your Domain= %s\n",domain);
            System.out.printf("Email= %s",email);

        }else{
            System.out.println("Your Email is InVALID!\nEmail should contain '@'.");
        }
    }
}
