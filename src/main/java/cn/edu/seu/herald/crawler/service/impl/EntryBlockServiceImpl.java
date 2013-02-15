/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import cn.edu.seu.herald.crawler.service.EntryBlockService;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class EntryBlockServiceImpl implements EntryBlockService {

    private List<EntryBlock> blocks1;
    private List<EntryBlock> blocks2;
    private List<EntryBlock> blocks3;
    private List<EntryBlock> blocks4;
    private static final List<String> tags = new LinkedList<String>();
    static {
        tags.add("讲座");
    }

    private static final EntryBlock[] rBlocks = {
            new EntryBlock("http://localhost:8084/herald-crawler/"
                + "static/img/holder_300x200.png", "Lorem ipsum dolor sit amet"
                + ", consectetur adipiscing elit. Mauris convallis eleifend bl"
                + "andit. In hac habitasse platea dictumst. Suspendisse vel mi"
                + " dolor.", tags, "#"),
            new EntryBlock("http://localhost:8084/herald-crawler/"
                + "static/img/holder_300x200.png", "Cum sociis natoque penatib"
                + "us et magnis dis parturient montes=, nascetur ridiculus mus"
                + ". Curabitur iaculis commodo eleifend. Fusce tincidunt tinci"
                + "dunt libero non tincidunt.", Collections.EMPTY_LIST, "#"),
            new EntryBlock(null, "Cum sociis natoque penatib"
                + "us et magnis dis parturient montes=, nascetur ridiculus mus"
                + ". Curabitur iaculis commodo eleifend. Fusce tincidunt tinci"
                + "dunt libero non tincidunt.", Collections.EMPTY_LIST, "#"),
            new EntryBlock("http://localhost:8084/herald-crawler/"
                + "static/img/holder_300x200.png", "Cum sociis natoque penatib"
                + "us et magnis dis parturient montes=, nascetur ridiculus mus"
                + ". Curabitur iaculis commodo eleifend. Fusce tincidunt tinci"
                + "dunt libero non tincidunt.", Collections.EMPTY_LIST, "#")
    };

    public EntryBlockServiceImpl() {
        blocks1 = new LinkedList<EntryBlock>();
        blocks2 = new LinkedList<EntryBlock>();
        blocks3 = new LinkedList<EntryBlock>();
        blocks4 = new LinkedList<EntryBlock>();
        mockInfo(blocks1, 15);
        mockInfo(blocks2, 20);
        mockInfo(blocks3, 5);
        mockInfo(blocks4, 1);
    }

    private static void mockInfo(List<EntryBlock> blocks, int size) {
        for (int counter = 1; counter <= size; ++counter) {
            int index = (int) (Math.random() * 4);
            blocks.add(rBlocks[index]);
        }
    }

    @Override
    public List<EntryBlock> getAllEntryBlocks() {
        List<EntryBlock> blocks = new LinkedList<EntryBlock>();
        blocks.addAll(blocks1);
        blocks.addAll(blocks2);
        blocks.addAll(blocks3);
        blocks.addAll(blocks4);
        return blocks;
    }

    @Override
    public boolean hasSubscribed(int subscriberId, int sectionId) {
        return (subscriberId == 1) && (sectionId >= 1 && sectionId <= 4);
    }

    @Override
    public List<EntryBlock> getEntryBlocksBySectionId(int sectionId,
            int offset, int limit) {
        List<EntryBlock> blocks;
        switch (sectionId) {
            case 1:
                blocks = blocks1;
                break;
            case 2:
                blocks = blocks2;
                break;
            case 3:
                blocks = blocks3;
                break;
            case 4:
                blocks = blocks4;
                break;
            default:
                blocks = Collections.EMPTY_LIST;
        }
        int toIndex = (offset + limit) > blocks.size()
                ? blocks.size()
                : offset + limit;
        return blocks.subList(offset, toIndex);
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int subscriberId, int year,
            int offset, int limit) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int subscriberId, int year,
            int month, int offset, int limit) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<EntryBlock> getEntryBlocksByKeyword(int subscriberId,
            String keyword) {
        return Collections.EMPTY_LIST;
    }
}
