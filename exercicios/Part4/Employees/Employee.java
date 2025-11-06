package Part4.Employees;

public sealed abstract class Employee permits Manager,Atendant,Salesman{
    private String login;
    private String password;
    private String email;
    private boolean adm;
    private boolean logged;


    public void changeLogin(String login){
        this.login = login;
        System.out.println("Login successfully changed");
    }

    public void login(){
        if(this.logged){
            System.out.println("The user is already logged in");
        }else{
            this.logged = true;
            System.out.println("Successfully logged in");
        }

    }

    public void logoff(){
        this.logged = false;
        System.out.println("Logged off");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password,String confirmedPassword) {
        if(!password.equals(confirmedPassword)){
            System.out.println("Passwords are different, please try again");
            return false;
        }else{
            this.password = password;
            return  true;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
}
