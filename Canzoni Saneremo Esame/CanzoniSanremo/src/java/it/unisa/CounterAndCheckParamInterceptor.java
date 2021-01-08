package it.unisa;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@CounterAndCheckParam
public class CounterAndCheckParamInterceptor {
    
    private int counter = 0;
    
    @AroundInvoke
    public Object logMethodAndCheckParam(InvocationContext ic) throws Exception {
        
        if(ic.getMethod().getName().equals("ottieniDaVotoMinimo")) {
            
            if((int) ic.getParameters()[0] < 10)
                return null;
            else return ic.proceed();
            
        } else {
            
            counter++;
            System.out.println("Chiamata n." + counter + ": Metodo " +
                    ic.getMethod().getName());
            return ic.proceed();
            
        }
        
    }
    
}
