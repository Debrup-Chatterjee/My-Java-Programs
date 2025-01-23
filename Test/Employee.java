class Employee
{
    public static void main(double pay)
    {
        double DA,HRA,PF,Gross,Net;
        DA=0.3*pay;
        HRA=0.15*pay;
        PF=0.125*pay;
        Gross=pay+DA+HRA;
        Net=Gross-PF;
        System.out.println("Gross Pay = "+Gross);
        System.out.println("Net Pay = "+Net);
    }
}
