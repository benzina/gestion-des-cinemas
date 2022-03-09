package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.*;
import com.demo.gestion_cinema.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Service
@Transactional
public class ICinemaServiceImp implements ICinemaInitService{

    @Autowired
    private VilleRepository villeRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private SalleRepository salleRepository;

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private ProjectionRepository projectionRepository;

    @Autowired
    private SeanceRepository seanceRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void initVilles() {
        Stream.of("Casablanca","Rabat","Kenitra","Tetouan").forEach(villeName->{
            Ville ville= new Ville();
            ville.setName(villeName);
            villeRepository.save(ville);
        });
    }

    @Override
    public void initCinema() {
        villeRepository.findAll().forEach(ville -> {
            Stream.of("Cinema Itihad","Megarama","IMAX","ASMAE").forEach(cinemaName->{
                Cinema cinema = new Cinema();
                cinema.setName(cinemaName);
                cinema.setVille(ville);
                cinema.setNbreSalle(3+(int)(Math.random()*7));
                cinemaRepository.save(cinema);
            });
        });
    }

    @Override
    public void initSalles() {
        cinemaRepository.findAll().forEach(cinema -> {
            for (int i=0;i<cinema.getNbreSalle();i++){
                Salle salle = new Salle();
                salle.setName("Salle N"+i);
                salle.setCinema(cinema);
                salle.setNbrePlace(10 + (int) (Math.random()*10));
                salleRepository.save(salle);
            }
        });
    }

    @Override
    public void initPlaces() {
        salleRepository.findAll().forEach(salle -> {
            for (int i=0;i<salle.getNbrePlace();i++){
                Place place = new Place();
                place.setSalle(salle);
                place.setNumero((long) i);
                placeRepository.save(place);
            }
        });
    }

    @Override
    public void initSeances() {
        DateFormat df = new SimpleDateFormat("HH:mm");
        Stream.of("12:00","15:00","17:00","19:00","21:00").forEach(s->{
            Seance seance = new Seance();
            try {
                seance.setStartHeure(df.parse(s));
                seanceRepository.save(seance);

            }catch (ParseException e){
                e.printStackTrace();
            }
        });
    }

    @Override
    public void initCategories() {
        Stream.of("Histoire","Action","Fiction","Drama").forEach(categoryName->{
            Category category = new Category();
            category.setName(categoryName);
            categoryRepository.save(category);
        });
    }

    @Override
    public void initFilms() {
        double [] durees = new double[] {1,1.5,2,2.5,3};
        List<Category> categories = categoryRepository.findAll();
        Stream.of("Seigneur des anneaux","Spider man","12 Homes en colaire","Forset Gump",
                "Green Book","La ligne verte","Le parin").forEach(filmTile->{
                        Film film =new Film();
                        film.setTitle(filmTile);
                        film.setCategory(categories.get(new Random().nextInt(categories.size())));
                        film.setDuree(durees[new Random().nextInt(durees.length)]);
                        film.setImage(filmTile.replaceAll(" ",""));
                        filmRepository.save(film);
        });
    }

    @Override
    public void initProjections() {
        double [] prix = new double[] {30,50,60,100,70,75};
        villeRepository.findAll().forEach(ville -> {
            ville.getCinemas().forEach(cinema -> {
                cinema.getSalles().forEach(salle -> {
                    filmRepository.findAll().forEach(film -> {
                        seanceRepository.findAll().forEach(seance -> {
                            ProjectionFilm projectionFilm = new ProjectionFilm();
                            projectionFilm.setDate(new Date());
                            projectionFilm.setFilm(film);
                            projectionFilm.setSalle(salle);
                            projectionFilm.setSeance(seance);
                            projectionFilm.setPrix(prix[new Random().nextInt(prix.length)]);
                            projectionRepository.save(projectionFilm);
                        });
                    });
                });
            });
        });
    }

    @Override
    public void initTickets() {
        projectionRepository.findAll().forEach(projectionFilm->{
            projectionFilm.getSalle().getPlaces().forEach(place -> {
                Ticket ticket = new Ticket();
                ticket.setPlace(place);
                ticket.setPrix(projectionFilm.getPrix());
                ticket.setProjectionFilm(projectionFilm);
                ticketRepository.save(ticket);
            });
        });
    }
}
