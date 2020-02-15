package gitlet;

import java.io.File;

/* Driver class for Gitlet, the tiny stupid version-control system.
   @author ShuaiYe
*/
public class Main {

    /* Usage: java gitlet.Main ARGS, where ARGS contains
       <COMMAND> <OPERAND> .... */
    public static void main(String... args) {
        File dir = new File(System.getProperty("user.dir") + "/.gitlet");
        System.out.println(dir.exists());
    }



}
