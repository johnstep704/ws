
package johnstep;

import javax.jws.WebService;

@WebService(endpointInterface = "johnstep.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

