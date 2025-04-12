package server.networking;

import javafx.application.Application;
import server.networking.sockethandling.MainSocketHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
  private int PORT = 5500;
  private boolean running;

  public Server(){
    running = false;
  }

  public void start() throws IOException
  {
    try{
      ServerSocket serverSocket = new ServerSocket(PORT);
      running = true;

      while (running){
        Socket clientSocket = serverSocket.accept();
        MainSocketHandler socketHandler = new MainSocketHandler(clientSocket);
        new Thread(socketHandler).start();
      }

    }catch (IOException io){
      io.printStackTrace();
      System.out.println("Error running the server. Try again.");
    }
  }

}
