/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import java.util.HashMap;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author CORSO_PD
 */
@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap <String, Integer> map =
            new HashMap <> ();
    
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
