package dataSources;

import models.Comment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CommentRepository extends AbstractRepository<Comment> {
    private static List<Comment> dataSource = new ArrayList<>();

    @PostConstruct
    public void init() {
        Comment firstComment = new Comment();
        firstComment.setArticleId(1);
        firstComment.setAuthorId(1);
        firstComment.setId(1);
        firstComment.setText("This article Stinks");
        dataSource.add(firstComment);
    }

    @Override
    public List<Comment> getAll() {
        return dataSource;
    }
}
