package quentin.pessl.dao;

import quentin.pessl.model.Launch;
import quentin.pessl.model.Patch;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Dependent
public class PatchDao {
    @Inject
    EntityManager em;


    public Patch get(int id){
        return em.find(Patch.class,id);
    }

    public List<Patch>getAll(){
        return em.createQuery("select p from Patch p",Patch.class).getResultList();
    }

}
