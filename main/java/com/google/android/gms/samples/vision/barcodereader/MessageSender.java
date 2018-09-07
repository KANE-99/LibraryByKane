package com.google.android.gms.samples.vision.barcodereader;


import java.io.DataOutputStream;

import java.io.PrintWriter;
import java.io.IOException;


import java.net.Socket;

import android.os.AsyncTask;

public class MessageSender extends AsyncTask<String,Void,Void>{
        Socket s;
        DataOutputStream dos;
        PrintWriter pw;

    @Override
    protected Void doInBackground(String... strings) {
        String message=strings[0];


        try{
            s=new Socket("192.168.43.129",5000);
            pw=new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();
        }catch(IOException e){
            System.out.println("Read from here");
            e.printStackTrace();
        }
        return null;
    }



}
