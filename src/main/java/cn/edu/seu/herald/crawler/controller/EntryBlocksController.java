/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import cn.edu.seu.herald.crawler.service.EntryBlockService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
@Controller
public class EntryBlocksController {

    private EntryBlockService entryBlockService;

    public EntryBlocksController(EntryBlockService entryBlockService) {
        this.entryBlockService = entryBlockService;
    }

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public ResponseEntity<String> getEntryBlocks() {
        List<EntryBlock> blocks = entryBlockService.getAllEntryBlocks();
        return getJsonResponseByBlocks(blocks);
    }

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public ResponseEntity<String> getEntryBlocksBySectionId(
            @RequestParam int sectionId,
            @RequestParam(required = false, defaultValue = "0") int offset,
            @RequestParam(required = false, defaultValue = "9") int limit) {
        List<EntryBlock> blocks = entryBlockService.getEntryBlocksBySectionId(
                sectionId, offset, limit);
        return getJsonResponseByBlocks(blocks);
    }

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public ResponseEntity<String> getEntryBlocksByArchive(
            @RequestParam int year,
            @RequestParam(required = false, defaultValue = "0") int offset,
            @RequestParam(required = false, defaultValue = "9") int limit) {
        List<EntryBlock> blocks = entryBlockService.getEntryBlocksByArchive(
                year, offset, limit);
        return getJsonResponseByBlocks(blocks);
    }

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public ResponseEntity<String> getEntryBlocksByArchive(
            @RequestParam int year, @RequestParam int month,
            @RequestParam(required = false, defaultValue = "0") int offset,
            @RequestParam(required = false, defaultValue = "9") int limit) {
        List<EntryBlock> blocks = entryBlockService.getEntryBlocksByArchive(
                year, month, offset, limit);
        return getJsonResponseByBlocks(blocks);
    }

    private static ResponseEntity<String> getJsonResponseByBlocks(
            List<EntryBlock> blocks) {
        String blocksJson = JsonUtils.getEntryBlocksJson(blocks);
        return JsonUtils.getJsonResponse(blocksJson, HttpStatus.OK);
    }
}
