package graphQL.Resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import dataSources.ArticleRepository;
import models.Article;
import models.Comment;
import models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private final ArticleRepository articleRepository;

    @Autowired
    public QueryResolver(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;

    }

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Article getArticle(Long id) {
        return articleRepository.findOne(id);
    }
}
