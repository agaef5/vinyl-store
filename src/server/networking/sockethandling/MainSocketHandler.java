package server.networking.sockethandling;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainSocketHandler implements Runnable
{
  private BufferedReader in;
  private PrintWriter out;
  private Socket socket;
  private Gson gson;

  public MainSocketHandler(Socket socket) throws IOException
  {
    this.socket = socket;
    in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
    out = new PrintWriter(this.socket.getOutputStream(), true);
    gson = new Gson();
  }

  @Override public void run()
  {
    while (true){
      try
      {
        in.readLine();
      }catch (IOException exception){
        exception.printStackTrace();
      }

    }

  }


}
