package dataSources;

import models.Profile;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class ProfileRepository extends AbstractRepository<Profile> {
    private static List<Profile> dataSource = new ArrayList<>();

    @PostConstruct
    public void init() {
        Profile Eduardo = new Profile();
        Eduardo.setBio("Eduardo Likes Coffee");
        Eduardo.setId(1);
        Eduardo.setUsername("gondolin");
    }

    @Override
    public List<Profile> getAll() {
        return dataSource;
    }
}
