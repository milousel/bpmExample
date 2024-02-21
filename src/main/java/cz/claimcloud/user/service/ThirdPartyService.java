package cz.claimcloud.user.service;

import cz.claimcloud.user.model.api.Post;

import java.io.IOException;
import java.util.List;

public interface ThirdPartyService {
    List<Post> getAllPosts() throws IOException;
}
