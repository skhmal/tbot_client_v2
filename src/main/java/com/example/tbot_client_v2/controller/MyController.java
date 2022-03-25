package com.example.tbot_client_v2.controller;

import com.example.tbot_client_v2.entity.Offer;
import com.example.tbot_client_v2.entity.User;
import com.example.tbot_client_v2.service.OfferService;
import com.example.tbot_client_v2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/")
class MyController {
    Set<String> set;
    @Autowired
    private OfferService offerService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showAllOffers(Model model){
        List<Offer> allOffers = offerService.getAllOffers();
        List<User> users = userService.getAllUsers();

        Map<Offer, User> map = new HashMap<>();

        for (Offer offer: allOffers) {
          String userName = String.valueOf(offer.getUserId());
          User user = userService.getUserByUserName(userName);
          String contactInfo = user.getContactInfo();
          map.put(offer, userService.getUserByUserName(String.valueOf(offer.getUserId())));
        }

        model.addAttribute("allOffers", allOffers);
        model.addAttribute("map", map);

        return "main";
    }
}
