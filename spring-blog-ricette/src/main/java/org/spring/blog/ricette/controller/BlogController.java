package org.spring.blog.ricette.controller;

import org.spring.blog.ricette.model.Ricetta;
import org.spring.blog.ricette.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ricetta")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

@GetMapping
    public String index(Model model){

    List<Ricetta> result = blogRepository.findAll();
    model.addAttribute("lista", result);
    return "/lista";
}

}
