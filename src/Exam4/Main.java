package Exam4;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[3];

        Word WordFile = new Word();
        files[0] = WordFile;

        System.out.println("");

        PNG PNGFile = new PNG();
        files[1] = PNGFile;

        System.out.println("");

        MP4 MP4File = new MP4();
        files[2] = MP4File;

        for (File file: files){
            System.out.println(file);
        }
    }
}

