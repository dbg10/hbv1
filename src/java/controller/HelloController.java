package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 * Setjum upp controller í MVC fyrir Halló Nafn
 * @author Viktor Jón Helgason vjh2@hi.is
 */
public class HelloController extends SimpleFormController {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
        //Initialize controller properties here or
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }

    //Use onSubmit instead of doSubmitAction
    //when you need access to the Request, Response, or BindException objects
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        Name name = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
    }
}