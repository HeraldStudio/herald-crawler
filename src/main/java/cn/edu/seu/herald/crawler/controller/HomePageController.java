/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.ArchiveLink;
import cn.edu.seu.herald.crawler.model.LoggedInUser;
import cn.edu.seu.herald.crawler.model.SectionLink;
import cn.edu.seu.herald.crawler.service.SectionLinkService;
import java.util.List;
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
    public String getHomePage(Model model, HttpSession session) {
        LoggedInUser loggedInUser = (LoggedInUser) session.getAttribute(
                "cn.edu.seu.herald.crawler.loggedInUser");
        boolean loggedIn = (loggedInUser != null);
        if (!loggedIn) { // TODO change
            return "redirect:/login";
        }
        List<SectionLink> sectionLinks = sectionLinkService
                .getSectionLinks(loggedInUser.getSubscriberId());
        List<ArchiveLink> archiveLinks = sectionLinkService
                .getArchiveLinks(loggedInUser.getSubscriberId());
        model.addAttribute("loggedInUser", loggedInUser);
        model.addAttribute("sectionLinks", sectionLinks);
        model.addAttribute("archiveLinks", archiveLinks);
        model.addAttribute("allUri", HOME_URI);
        return "home";
    }
}
