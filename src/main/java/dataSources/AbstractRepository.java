package dataSources;

import java.util.List;

public abstract class AbstractRepository<Type> {

    public abstract List<Type> findAll();


}
