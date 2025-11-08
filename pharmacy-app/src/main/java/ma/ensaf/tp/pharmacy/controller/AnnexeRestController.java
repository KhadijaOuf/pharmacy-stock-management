package ma.ensaf.tp.pharmacy.controller;

import ma.ensaf.tp.pharmacy.model.Categorie;
import ma.ensaf.tp.pharmacy.model.Fournisseur;
import ma.ensaf.tp.pharmacy.model.Tag;
import ma.ensaf.tp.pharmacy.dao.CategorieRepository;
import ma.ensaf.tp.pharmacy.dao.FournisseurRepository;
import ma.ensaf.tp.pharmacy.dao.TagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnexeRestController {

    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/api/categories")
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @GetMapping("/api/fournisseurs")
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @GetMapping("/api/tags")
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }
}
