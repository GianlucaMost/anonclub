/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import logic.Shoutbox;

/**
 *
 * @author gianlucamost
 */
@Path("/shoutbox")
public class Service {
    private List<Shoutbox> sbList = new ArrayList<Shoutbox>();
    
    public Service(){}
    
    @GET
    @Produces("application/json")
    public List<Shoutbox> getSbList(){
        return this.sbList;
    }
    @PUT
    public void setMessage(@QueryParam("name") String name, @QueryParam("date") String date, @QueryParam("message") String message){
        this.sbList.add(new Shoutbox(name, date, message));
    }
}
