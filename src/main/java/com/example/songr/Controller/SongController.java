package com.example.songr.Controller;


import com.example.songr.Model.Album;
import com.example.songr.AlbumRepository;
import com.example.songr.Model.Song;
import com.example.songr.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getBooks(Model model){
        model.addAttribute("songs",songRepository.findAll());
        return "songs.html";
    }

    @PostMapping("/addSong")
    public RedirectView addSong(String title, int length,int trackNumber,int albumId){
        Album album = albumRepository.findById(albumId).get();
        Song song = new Song(title,length,trackNumber,album);
        songRepository.save(song);
        return new RedirectView("/songs");
    }

    @GetMapping("/albums/{id}")
    public String albumContent(@PathVariable ("id") Integer id,Model m){
        Album album = albumRepository.findById(id).get();
        m.addAttribute("album", album);
        return "albumContent.html";
    }

}
