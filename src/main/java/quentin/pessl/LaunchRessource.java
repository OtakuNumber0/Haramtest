package quentin.pessl;

import quentin.pessl.dao.LaunchDao;
import quentin.pessl.model.Launch;
import quentin.pessl.model.Patch;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Transactional
@Path("/launches")
public class LaunchRessource {
@Inject
    LaunchDao dao;

@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Launch get(@PathParam("id")int id ){
    return dao.get(id);
}
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Launch> getAll(){
    return dao.getAll();}
    }


