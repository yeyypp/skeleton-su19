package gitlet;

import java.io.File;

/**
 * @author shuai
 * @date 2020/2/14
 */

public class Command {
    public static void init() {
        String currentDir = System.getProperty("user.dir");
        File gitDir = new File(currentDir + "/gitDir");
        if (gitDir.exists()) {
            System.out.println("A gitlet version-control system " +
                    "already exists in the current directory");
        } else {

        }
    }
}
