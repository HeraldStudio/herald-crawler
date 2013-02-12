/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.model;

import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class EntryBlock {

    private String imageUrl;
    private String text;
    private List<String> tags;
    private String link;

    public EntryBlock(String imageUrl, String text, List<String> tags,
            String link) {
        this.imageUrl = imageUrl;
        this.text = text;
        this.tags = tags;
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getText() {
        return text;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getLink() {
        return link;
    }
}
