package quentin.pessl.dao;

import quentin.pessl.model.Launch;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Dependent
public class LaunchDao {
    @Inject
    EntityManager em;

    public List<Launch>getAll(){
        return em.createQuery("select l from Launch l",Launch.class).getResultList();
    }
    public Launch get(int id){
        return em.find(Launch.class, id);
    }
}
