/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.domain.Entry;
import cn.edu.seu.herald.crawler.domain.Tag;
import cn.edu.seu.herald.crawler.model.EntryBlock;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class EntryUtils {

    public static List<EntryBlock> getEntryBlocks(List<Entry> entries) {
        List<EntryBlock> blocks = new LinkedList<EntryBlock>();
        for (Entry entry : entries) {
            EntryBlock block = getEntryBlock(entry);
            blocks.add(block);
        }
        return blocks;
    }

    public static EntryBlock getEntryBlock(Entry entry) {
        String imageUrl = entry.getImageUrl();
        String text = entry.getText();
        List<String> tags = new LinkedList<String>();
        for (Tag tag : entry.getTags()) {
            tags.add(tag.getName());
        }
        String link = entry.getLink();

        EntryBlock block = new EntryBlock(imageUrl, text, tags, link);
        return block;
    }
}
