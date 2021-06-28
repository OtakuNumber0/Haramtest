package quentin.pessl;

import quentin.pessl.dao.PatchDao;
import quentin.pessl.model.Patch;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Transactional
@Path("/patches")
public class PatchRessource {
@Inject
PatchDao dao;

@GET
    @Path("/{id}")
    public Patch get(@PathParam("id")int id){
    return dao.get(id);
}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Patch> getAll(){
    return dao.getAll();}

}
