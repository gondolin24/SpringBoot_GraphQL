package dataSources;

import models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProfileRepository extends AbstractRepository<Profile> {
    private static List<Profile> dataSource = new ArrayList<>();

    @PostConstruct
    public void init() {
        Profile Eduardo = new Profile();
        Eduardo.setBio("Eduardo Likes Coffee");
        Eduardo.setId(1);
        Eduardo.setUsername("gondolin");
        dataSource.add(Eduardo);
    }

    @Override
    public List<Profile> findAll() {
        return dataSource;
    }
}
