/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.LoggedInUser;
import cn.edu.seu.herald.crawler.model.SectionLink;
import cn.edu.seu.herald.crawler.service.SectionLinkService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class HomePageController {

    private static final String HOME_URI = "./blocks";
    private SectionLinkService sectionLinkService;

    public HomePageController(SectionLinkService sectionLinkService) {
        this.sectionLinkService = sectionLinkService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(Model model, HttpServletRequest request) {
        return "home";
//        HttpSession session = request.getSession();
//        LoggedInUser loggedInUser = (LoggedInUser) session.getAttribute(
//                "cn.edu.seu.herald.crawler.loggedInUser");
//        List<SectionLink> sectionLinks = sectionLinkService
//                .getSectionLinks(loggedInUser.getSubscriberId());
//        model.addAttribute("loggedInUser", loggedInUser);
//        model.addAttribute("sectionLinks", sectionLinks);
//        model.addAttribute("uri", HOME_URI);
//        return "home";
    }
}
