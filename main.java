package com.test;

import java.io.File;
import java.io.ByteArrayOutPutStream;
import java.io.FileOutPutStream;

public class main{
    public static void main(String args[]){
        try {
            File file = new File( pathname: "C:\Users\ayush\OneDrive\Documents")
            String content = "This is Ayushi"
            ByteArrayOutPutStream out = QRCode.from(content).to(ImageType.JPG).stream();
            FileOutPutStream fos = new FileOutPutStream(file)
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("Done");
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
} 