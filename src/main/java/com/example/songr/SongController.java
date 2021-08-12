package com.example.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}
