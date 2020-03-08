package pl.weglewski.praca_tydzien6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weglewski.praca_tydzien6.service.FilmService;
import pl.weglewski.praca_tydzien6.model.Film;

import java.util.List;


@RestController
public class FilmController {

    private FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms(){
        List<Film> allFilms = filmService.getAllFilms();
        return new ResponseEntity<>(allFilms, HttpStatus.OK);
    }

    @PostMapping
    @AspectAfterAdd
    public ResponseEntity<Film> addFilm(@RequestBody Film film){
        boolean add = filmService.addFilm(film);
        if(add){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
