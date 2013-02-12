/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.model;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class ArchiveLink {

    private String name;
    private String uri;

    public ArchiveLink(String name, String uri) {
        this.name = name;
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }
}
