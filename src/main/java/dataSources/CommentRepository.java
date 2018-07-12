package dataSources;

import models.Comment;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository extends AbstractRepository<Comment> {
    private static List<Comment> dataSource = new ArrayList<>();
    @PostConstruct
    public void init(){

    }

    @Override
    public List<Comment> getAll() {
        return dataSource;
    }
}
