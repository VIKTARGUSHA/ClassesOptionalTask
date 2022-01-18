package ThirdTask;

import java.io.File;
public class ThirdTask {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files\\Git");
        String [] filelist = file.list();
        for (String str : filelist){
            System.out.println(str);
        }
    }
}
