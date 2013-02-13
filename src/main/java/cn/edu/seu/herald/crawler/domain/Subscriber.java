/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.domain;

import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class Subscriber {

    private int id;
    private String username;
    private String password;
    private String nickname;
    private List<Section> sections;

    public Subscriber(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Section> getSubscribedSection(int sectionId) {
        return null;
    }

    public List<Section> getSubscribedSections() {
        return sections;
    }

    public void subscribe(int sectionId) {
        sections.add(null);
    }

    public boolean hasSubscribed(int sectioId) {
        return false;
    }

    public Archive getArchive(int year) {
        return null;
    }

    public Archive getArchive(int year, int month) {
        return null;
    }
}
