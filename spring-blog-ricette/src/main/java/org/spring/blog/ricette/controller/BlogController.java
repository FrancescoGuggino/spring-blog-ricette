package org.spring.blog.ricette.controller;

import org.spring.blog.ricette.model.Ricetta;
import org.spring.blog.ricette.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ricetta")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

@GetMapping
    public String index(Model model){

    List<Ricetta> result = blogRepository.findAll();
    model.addAttribute("ricette", result);
    return "/ricette";
}

    @GetMapping("/show/{id}")
    public String show(@PathVariable Integer id, Model m){
        Optional<Ricetta> op = blogRepository.findById(id);
        if (op.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        Ricetta ricetta = op.get();
        m.addAttribute("ricetta", ricetta);
        return "/dettagli";
    }
}
