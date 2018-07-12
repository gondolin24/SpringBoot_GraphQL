package graphQL.Resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import dataSources.ArticleRepository;
import dataSources.CommentRepository;
import dataSources.ProfileRepository;
import models.Article;
import models.Comment;
import models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;
    private final ProfileRepository profileRepository;

    @Autowired
    public QueryResolver(ArticleRepository articleRepository, ProfileRepository profileRepository, CommentRepository commentRepository) {
        this.articleRepository = articleRepository;
        this.profileRepository = profileRepository;
        this.commentRepository = commentRepository;


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

    public Article getArticle(int id) {
        return articleRepository.findOne(id);
    }
}
