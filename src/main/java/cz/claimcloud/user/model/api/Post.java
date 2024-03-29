package cz.claimcloud.user.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private int userId;
    private int id;
    private String body;
    private String title;
}