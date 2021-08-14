package com.example.songr;

import com.example.songr.Model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SongrApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void Constructor() {
		Album album = new Album("Meteora","Linkin Park",7,2527,"https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg");
        assertEquals("Album{title='Meteora', artist='Linkin Park', songCount=7, length=2527, imageUrl='https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg'}",album.toString());
    }

    @Test
    void SetnGet() {
        Album album = new Album();
        album.setTitle("Meteora");
        album.setArtist("Linkin Park");
        album.setSongCount(7);
        album.setLength(2527);
        album.setImageUrl("https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg");
        assertEquals("Meteora",album.getTitle());
        assertEquals("Linkin Park",album.getArtist());
        assertEquals(7,album.getSongCount());
        assertEquals(2527,album.getLength());
        assertEquals("https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg",album.getImageUrl());
    }
}
