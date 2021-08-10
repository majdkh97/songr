package com.example.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String albums(Model model){
//        Album album1 = new Album("Meteora","Linkin Park",7,2527,"https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg");
//        Album album2 = new Album("Avenged Sevenfold","Avenged Sevenfold",10,5307,"https://upload.wikimedia.org/wikipedia/en/thumb/7/76/Avenged_Sevenfold_cover_2007.jpg/220px-Avenged_Sevenfold_cover_2007.jpg");
//        Album album3 = new Album("Dear Agony","Breaking Benjamin",11,4155,"https://upload.wikimedia.org/wikipedia/en/thumb/6/6d/Breakingbenjamindearagony.jpg/220px-Breakingbenjamindearagony.jpg");
//        List<Album> albums = new ArrayList<>();
//        albums.add(album1);
//        albums.add(album2);
////        albums.add(album3);
//        albumRepository.save(album1);
//        albumRepository.save(album2);
//        albumRepository.save(album3);
        model.addAttribute("albums",albumRepository.findAll());

        return "albums.html";
    }
    @PostMapping("/addAlbum")
    public RedirectView add(@ModelAttribute Album album,Model model){
        model.addAttribute("albums",album);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }
}
