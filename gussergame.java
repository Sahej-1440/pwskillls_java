import java.util.*;
class gussers
{
    int guessNum;
    int gussesingnumber()
    {         
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    } 
}
class player
{
    int guessNum;
    int getGuessNum() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please guess the number!!");
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class umpire
{
    int numfromgusser;
    int ram;
    int shyam;
    int ravi;
    void collectnumfromgussser()
    { 
         gussers gs=new gussers();
         numfromgusser=gs.gussesingnumber();


    }
    void collectnumfromplayer()
    {
         player p1=new player();
         player p2=new player();
         player p3=new player();
         ram=p1.getGuessNum();
         shyam=p2.getGuessNum();
         ravi=p3.getGuessNum();

    }
    void compare()
    {
        if(numfromgusser==ram)
        {
            System.out.println("ram is winner");
        }
        else if(numfromgusser==shyam)
        {
            System.out.println("shyam is the winner");
        }
        else if(numfromgusser==ravi)
        {
            System.out.println("ravi is the winner");
        }
        else
        {
            System.out.println("tun tun mousi jeet gayi aap nhi");
        }
    }
}
public class gussergame 
{
    public static void main(String[] args) 
    {
        umpire up=new umpire();
        up.collectnumfromgussser();
        up.collectnumfromplayer();
        up.compare();
    }
}
