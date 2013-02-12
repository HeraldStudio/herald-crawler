/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.domain;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class Tag {

    private String name;
    private Subscriber tagger;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Subscriber getTagger() {
        return tagger;
    }

    public void setTagger(Subscriber tagger) {
        this.tagger = tagger;
    }
}
