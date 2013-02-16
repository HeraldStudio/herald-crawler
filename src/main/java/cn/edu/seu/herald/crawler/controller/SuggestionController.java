/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.LoggedInUser;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
@Controller
public class SuggestionController {

    @RequestMapping(value = "/suggestion", method = RequestMethod.GET)
    public String getSuggestionPage(Model model, HttpSession session) {
        AuthenticationManager authManager = new AuthenticationManager(session);
        if (!authManager.isAuthenticated()) { // TODO change
            return "redirect:/login";
        }
        LoggedInUser loggedInUser = authManager.getLoggedInUser();
        model.addAttribute("loggedInUser", loggedInUser);
        model.addAttribute("selector", "#suggestion");
        return "suggestion";
    }

    @RequestMapping(value = "/suggestion", method = RequestMethod.POST)
    public String postSuggestion(String content, HttpSession session) {
        AuthenticationManager authManager = new AuthenticationManager(session);
        if (!authManager.isAuthenticated()) { // TODO change
            return "redirect:/login";
        }
        LoggedInUser loggedInUser = authManager.getLoggedInUser();
        return "redirect:/";
    }
}
