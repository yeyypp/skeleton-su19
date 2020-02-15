package gitlet;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author shuai
 * @date 2020/2/14
 */

public class Commit implements Serializable {
    private List<Blob> blobs;
    private String parent;
    private LocalDateTime timestamp;
    private String logMessage;

}
