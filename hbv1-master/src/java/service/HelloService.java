package service;

/**
 * Service sem segir Halló Nafn við notanda
 * @author Viktor Jón Helgason vjh2@hi.is
 */
public class HelloService {

    public String sayHello(String name, String pass) {
        if(name.equals("Gulli") && pass.equals("1234")) 
        {
            return validLogin(name);
        }
        else 
            return displayErrorMessage();
    }
    
    private String displayErrorMessage(){
        return "Wrong username or password.";
    }
    
    private String validLogin(String name){
        return "<h1>Hello " + name + ".</h1><h2> You have successfully logged in.</h2>" +
                    "<br>"
                    + "<table class=\"table table-inverse\">\n" +
"  <thead>\n" +
"    <tr>\n" +
"      <th>#</th>\n" +
"      <th>First Name</th>\n" +
"      <th>Last Name</th>\n" +
"      <th>Username</th>\n" +
"    </tr>\n" +
"  </thead>\n" +
"  <tbody>\n" +
"    <tr>\n" +
"      <th scope=\"row\">1</th>\n" +
"      <td>Mark</td>\n" +
"      <td>Otto</td>\n" +
"      <td>@mdo</td>\n" +
"    </tr>\n" +
"    <tr>\n" +
"      <th scope=\"row\">2</th>\n" +
"      <td>Jacob</td>\n" +
"      <td>Thornton</td>\n" +
"      <td>@fat</td>\n" +
"    </tr>\n" +
"    <tr>\n" +
"      <th scope=\"row\">3</th>\n" +
"      <td>Larry</td>\n" +
"      <td>the Bird</td>\n" +
"      <td>@twitter</td>\n" +
"    </tr>\n" +
"  </tbody>\n" +
"</table>"
                    + "<input type=\"button\" \n" +
"  onClick=\"window.print()\" \n" +
"  value=\"Print This Page\"/>";
    }
}