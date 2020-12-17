package it.unisa;

import java.util.HashMap;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Counter
public class CounterInterceptor {
    
    HashMap <String, Integer> map = new HashMap <> ();
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        
        String nomeMetodo = ic.getMethod().getName();
        
        if(!map.containsKey(nomeMetodo))
            map.put(nomeMetodo, 0);
        map.put(nomeMetodo, map.get(nomeMetodo) + 1);
        
        System.out.println("Il metodo " + nomeMetodo + " è stato chiamato " + 
                map.get(nomeMetodo) + " volte.");
        
        return ic.proceed();
        
    }
    
}
