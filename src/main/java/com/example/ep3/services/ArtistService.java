package com.example.ep3.services;

import com.example.ep3.classes.Artist;
import com.example.ep3.interfaces.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service("artistService")
public class ArtistService {

    @Autowired
    private ArtistRepository repository;

    @PostConstruct
    public void test(){
//        Artist newArtist = new Artist();
//        newArtist.setNome("Picasso");
//        newArtist.setDescArtista("Grande artista Europeu");
//        newArtist.setDataMorte(new Date());
//        newArtist.setEstiloPrincipal("Abstrato");
//        newArtist.setPeriodoArt("1999-2001");
//        newArtist.setPaisDeOrigem(new Locale("US"));
//
//        System.out.println("-----------------------------------------" + newArtist);
//
//        repository.save(newArtist);

        Optional<Artist> result = Optional.ofNullable(repository.findArtistByNome("Van Ghog"));

        result.ifPresent(artist -> System.out.println(artist.getNome() + artist.getDescArtista()));

        Iterable<Artist> iterator = repository.findAll();
        iterator.forEach(artist -> System.out.println(artist.getNome() + artist.getDescArtista()));

        long count = repository.count();
        System.out.println("Numero de artistas " + count);

    }
}
