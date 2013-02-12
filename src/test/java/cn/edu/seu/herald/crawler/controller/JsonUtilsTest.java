/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class JsonUtilsTest {

    public JsonUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getJsonResponse method, of class JsonUtils.
     */
    @Test
    public void testGetJsonResponse() {
//        System.out.println("getJsonResponse");
//        String json = "";
//        HttpStatus status = null;
//        ResponseEntity expResult = null;
//        ResponseEntity result = JsonUtils.getJsonResponse(json, status);
//        assertEquals(expResult, result);
    }

    /**
     * Test of getJsonResponse method, of class JsonUtils.
     */
    @Test
    public void testGetEntryBlocksJson() {
        System.out.println("getEntryBlocksJson");
        List<String> tags = new LinkedList<String>();
        tags.add("tag1");
        tags.add("tag2");
        EntryBlock block1 = new EntryBlock("imageUrl1", "text1", tags, "links1");
        EntryBlock block2 = new EntryBlock("imageUrl2", "text2", tags, "links2");
        List<EntryBlock> entryBlock = new LinkedList<EntryBlock>();
        entryBlock.add(block1);
        entryBlock.add(block2);
        String expResult = "{\"blocks\":"
                + "[{\"imageUrl\":\"imageUrl1\","
                + "\"link\":\"links1\","
                + "\"tags\":["
                + "\"tag1\","
                + "\"tag2\"],\"text\":"
                + "\"text1\"}"
                + ","
                + "{\"imageUrl\":\"imageUrl2\","
                + "\"link\":\"links2\","
                + "\"tags\":["
                + "\"tag1\","
                + "\"tag2\"],"
                + "\"text\":\"text2\"}"
                + "]}";
        String result = JsonUtils.getEntryBlocksJson(entryBlock);
        assertEquals(expResult, result);
    }
}
