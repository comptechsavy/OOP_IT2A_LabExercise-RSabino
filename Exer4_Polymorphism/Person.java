public class Person{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public Person() {
        this.firstName = "No FirstName";
        this.lastName = "No LastName";
        this.userName = "No userName";
        this.password = "No Password";
    }

    public Person(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getuserName(){
        return userName;
    }
    public String getpassword(){
        return password;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
     public void displayInfo(){
          System.out.println("Admin Name: " + firstName + " " + lastName);
          System.out.println("Username: " + userName);
     }    
}