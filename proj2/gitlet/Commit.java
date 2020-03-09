package gitlet;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

/**
 * @author shuai
 * @date 2020/2/14
 */

public class Commit implements Serializable {
    private final String parent;
    private LocalDateTime timestamp;
    private final String message;
    private HashMap<String, String> contents = new HashMap<>();


    public Commit(String parent, String message) {
        this.parent = parent;
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }



}
