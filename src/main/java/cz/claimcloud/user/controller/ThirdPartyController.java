package cz.claimcloud.user.controller;

import cz.claimcloud.user.model.api.Post;
import cz.claimcloud.user.service.ThirdPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController

@RequestMapping("/v1/retro")
@RequiredArgsConstructor
public class ThirdPartyController {

    private final ThirdPartyService service;

    @GetMapping(path = "allposts")
    public ResponseEntity<List<Post>> getAllPosts() throws IOException {
        return ResponseEntity.ok(service.getAllPosts());
    }
}
