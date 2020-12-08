package it.unisa;

import java.util.HashMap;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@Counter
public class CounterInterceptor {
    
    private HashMap <String, Integer> map = new HashMap <> ();
        
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        if(ic.getMethod().getName().equals("printByCountry")) {
            if(!map.containsKey("printByCountry"))
                map.put("printByCountry", 1);
            else map.put("printByCountry", map.get("printByCountry") + 1);
            System.out.println("Il metodo printByCountry è stato chiamato: " + 
                map.get("printByCountry") + " volte.");
        }
        
        return ic.proceed();
    }
    
}
