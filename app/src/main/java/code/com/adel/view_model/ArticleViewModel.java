package code.com.adel.view_model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import code.com.adel.repository.ArticleRepository;
import code.com.adel.response.ArticleResponse;


public class ArticleViewModel extends AndroidViewModel {

    private ArticleRepository articleRepository;
    private LiveData<ArticleResponse> articleResponseLiveData;

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        articleRepository = new ArticleRepository();
        this.articleResponseLiveData = articleRepository.getMovieArticles("movies", "84a7decf3110498ea372bd16dd0601e8");
    }

    public LiveData<ArticleResponse> getArticleResponseLiveData() {
        return articleResponseLiveData;
    }
}
