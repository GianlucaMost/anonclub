/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import logic.Shoutbox;

/**
 *
 * @author gianlucamost
 */

@Path("shoutbox")
public class Service {
    private List<Shoutbox> sbList = new ArrayList<Shoutbox>();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Shoutbox> getShoutBoxList(){
        //TODO nen String zurueck geben, den ich mir dann zu JSON umbastel
        return sbList;
    }
    
    @PUT
    public void setShoutBox(@QueryParam("datum") String datum, @QueryParam("name") String name, @QueryParam("nachricht") String nachricht) {
        Shoutbox sb = new Shoutbox();
        sb.setDate(datum);
        sb.setName(name);
        sb.setNachricht(nachricht);
    }
    
}
