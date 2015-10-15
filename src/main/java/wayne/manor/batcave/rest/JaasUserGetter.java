package wayne.manor.batcave.rest;

import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("userid")
public class JaasUserGetter {
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserid(@Context HttpServletRequest req){
        return Response.ok(new Gson().toJson(req.getUserPrincipal().getName())).build();
    }
}