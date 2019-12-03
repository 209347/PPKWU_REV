package com.example.demo.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.time.*;

import java.util.ArrayList;
import java.util.HashMap;


@RestController public class StringApiController {

    @GetMapping("/api/reverse/{message}") @ResponseStatus(HttpStatus.OK) public String reverseMessage(@PathVariable String message) {
        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse = reverse + message.charAt(i);
        }
        return reverse;
    }

}