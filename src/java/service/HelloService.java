package service;

/**
 * Service sem segir Halló Nafn við notanda
 * @author Viktor Jón Helgason vjh2@hi.is
 */
public class HelloService {

    public String sayHello(String name, String pass) {
        if(name.equals("Gulli") && pass.equals("1234")) 
        {
            return "Hello " + name + ". You have successfully logged in.";
        }
        else 
            return "Wrong username or password.";
    }
}