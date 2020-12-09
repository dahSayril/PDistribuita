package it.unisa;

import java.util.HashMap;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap <String, Integer> map = new HashMap <> ();
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        
        String nomeMetodo = ic.getMethod().getName(); 
        
        if(!map.containsKey(nomeMetodo))
            map.put(nomeMetodo, 1);
        else map.put(nomeMetodo, map.get(nomeMetodo) + 1);
        
        System.out.println("Chiamato il methodo: " + nomeMetodo + " " 
                + map.get(nomeMetodo) + " volte.");
        
        return ic.proceed();
        
    }
    
}
