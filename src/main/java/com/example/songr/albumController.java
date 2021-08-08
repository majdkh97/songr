package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {

    @GetMapping("/albums")
    public String albums(Model model){
        Album album1 = new Album("Meteora","Linkin Park",7,2527,"https://upload.wikimedia.org/wikipedia/en/b/b2/Meteora_Live_Around.jpg");
        Album album2 = new Album("Avenged Sevenfold","Avenged Sevenfold",10,5307,"https://upload.wikimedia.org/wikipedia/en/thumb/7/76/Avenged_Sevenfold_cover_2007.jpg/220px-Avenged_Sevenfold_cover_2007.jpg");
        Album album3 = new Album("Dear Agony","Breaking Benjamin",11,4155,"https://upload.wikimedia.org/wikipedia/en/thumb/6/6d/Breakingbenjamindearagony.jpg/220px-Breakingbenjamindearagony.jpg");
        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        model.addAttribute("albums",albums);

        return "albums.html";
    }
}
