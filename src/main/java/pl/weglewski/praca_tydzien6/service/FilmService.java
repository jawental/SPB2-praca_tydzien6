package pl.weglewski.praca_tydzien6.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import pl.weglewski.praca_tydzien6.model.Film;

@Component
public class FilmService {

    private List<Film> filmList = new ArrayList<>();

    public FilmService() {
        filmList.add(new Film(1,"PULP FICTION",1994, "USA"));
        filmList.add(new Film(2,"ŻYCIE JEST PIĘKNE", 1997, "Włochy"));
        filmList.add(new Film(3,"PSY", 1992, "Polska"));
    }

    public List<Film> getAllFilms() {
        return filmList;
    }

    public boolean addFilm(Film film) {
        return filmList.add(film);
    }
}
