package com.soho.template.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author soho.chan
 * @date 4/9/2020 18:12
 * @description TODO
 */
@RestController("data")
public class TestController {
    private static final int DATA_SIZE = 10;
    private static List<HashMap<String, String>> data = new ArrayList<>();

    {
        for (int i = 0; i < DATA_SIZE; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("id", String.valueOf(i));
            map.put("name", "user" + i);
            data.add(map);
        }
    }

    @GetMapping("list")
    public List<HashMap<String, String>> getAll() {
        return data;
    }

    @GetMapping("{id}")
    public HashMap<String, String> getById(@PathVariable String id) {
        if (id != null) {
            for (HashMap<String, String> map: data) {
                if (id.equals(map.get("id"))) {
                    return map;
                }
            }
        }
        return null;
    }

}
