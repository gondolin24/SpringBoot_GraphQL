package dataSources;

import models.Article;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ArticleRepository extends AbstractRepository<Article> {

    private static List<Article> dataSource = new ArrayList<>();

    @PostConstruct
    public void init() {
        Article article1 = new Article();
        article1.setId(19);
        article1.setText("So like...Harry DieD");
        article1.setAuthorId(1);
        article1.setTitle("Harry Potter Dies");
        dataSource.add(article1);

    }


    @Override
    public List<Article> getAll() {
        return dataSource;
    }
}
