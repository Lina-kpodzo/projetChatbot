package org.ldv.projetchatbott.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
/**
    // Route pour la page d'accueil
    @GetMapping("/", "/accueil")
    fun accueil(): String {
        // Renvoie le fichier templates/accueil.html (ou selon votre sous-dossier, ex: utilisateur/accueil)
        return "accueil"
    }
**/
    // Route pour le formulaire de connexion (non fonctionnel pour l'instant)
    @GetMapping("/login")
    fun login(): String {
        // Renvoie le fichier templates/auth/login.html ou auth.html selon votre structure
        return "auth/login"
    }
}