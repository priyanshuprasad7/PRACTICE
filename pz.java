public class pz {
  public static void main(String args[]){
    BankAccount  holder_name = new BankAccount();
    holder_name.setpassword("mynameispriyanshu");
    holder_name.user_name="priyanshu prasad";
    System.out.println(holder_name.user_name);
    // System.out.println(holder_name.password);


  }
}
class BankAccount{
  public String user_name;
  private String password;
  public int mobilenumber;
    void setpassword(String pwd){
      password = pwd;
  }


}