import java.io.File;
public class ThirdTask {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files\\ClassesMusic2");
        String [] filelist = file.list();
        for (String str : filelist){
            System.out.println(str);
        }
    }
}
