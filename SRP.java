class AccountService
{
    AccountCreation ac=new AccountCreation();
    NotificationService ns=new NotificationService();
    public void openAccount()
    {
        System.out.println("Fill details");
        ac.Create();
        ns.Push();


    }
}
class AccountCreation
{
    public void Create()
    {
       System.out.println("Account is created");
    }
}
class NotificationService
{
    public void Push()
    {
        System.out.println("Welcome");
    }
}
class SRP
{
    public static void main(String args[])
    {
        AccountService as=new AccountService();
        as.openAccount();
    }
}