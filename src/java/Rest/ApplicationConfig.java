/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author gianlucamost
 */
@ApplicationPath("resources")
public class ApplicationConfig extends Application {
    private Set<Object> singletons;
    
    public ApplicationConfig(){
        singletons = new HashSet<Object>();
        singletons.add(new Service());
    }
    @Override
    public Set<Class<?>> getClasses(){
        return new HashSet<Class<?>>();
    }
    @Override
        public Set<Object> getSingletons(){
        return singletons;
    }
}
