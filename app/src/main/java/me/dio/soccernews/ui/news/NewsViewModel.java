package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec luctus ex nec purus porta, ut aliquam odio porttitor. Integer vitae fermentum diam, in tincidunt velit. Integer dictum ut dui a tincidunt. Curabitur scelerisque vulputate ante vel eleifend. Nullam consectetur leo ac pellentesque varius."));
        news.add(new News("Ferrinha Joga No sábado", "Quisque tellus diam, finibus in feugiat vitae, interdum et arcu. Cras at lectus eget est accumsan congue. Fusce malesuada odio eget lectus semper gravida. Curabitur pellentesque justo in massa vestibulum, scelerisque tempor felis fringilla. Pellentesque nec hendrerit nisi. Proin ligula tellus, gravida eu felis vulputate, semper semper nisi."));
        news.add(new News("Copa do Mundo Feminina Está Terminando", "Cras sed massa cursus, efficitur libero nec, auctor augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Vivamus finibus rhoncus velit eget eleifend. Cras urna nisi, lacinia eu laoreet quis, consequat eget dui. Ut at odio non velit sodales molestie. Vestibulum non ullamcorper turpis."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}
