/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class JsonUtils {

    private static final String JSON_HEADER = "text/json;charset=UTF-8";

    public static ResponseEntity<String> getJsonResponse(String json,
            HttpStatus status) {
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", JSON_HEADER);
        ResponseEntity<String> blocksResponse =
                new ResponseEntity<String>(json, header, status);
        return blocksResponse;
    }

    public static String getEntryBlocksJson(List<EntryBlock> entryBlock) {
        JSONArray jsonArray = JSONArray.fromObject(entryBlock);
        JSONObject jsonObj = new JSONObject();
        jsonObj.accumulate("blocks", jsonArray);
        return jsonObj.toString();
    }
}
