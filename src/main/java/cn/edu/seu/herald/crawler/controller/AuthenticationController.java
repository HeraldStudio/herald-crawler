/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.LoggedInUser;
import cn.edu.seu.herald.crawler.service.AuthenticationFailure;
import cn.edu.seu.herald.crawler.service.AuthenticationService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
@Controller
public class AuthenticationController {

    private AuthenticationService authenticationService;

    public AuthenticationController(
            AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logIn() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logIn(@RequestParam String username,
            @RequestParam String password, HttpServletRequest request) {
        try {
            LoggedInUser loggedInUser = authenticationService.
                    getLoggedInUserIfConfirmed(username, password);
            HttpSession session = request.getSession();
            session.setAttribute("cn.edu.seu.herald.crawler.loggedInUser",
                    loggedInUser);
            return "redirect:/";
        } catch (AuthenticationFailure ex) {
            return "redirect:/login?err=1";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("cn.edu.seu.herald.crawler.loggedInUser");
        return "redirect:/";
    }
}
