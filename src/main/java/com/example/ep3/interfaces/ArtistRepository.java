package com.example.ep3.interfaces;

import com.example.ep3.classes.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Artist findArtistByNome(String nome);
}
