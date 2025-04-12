package server.networking.sockethandling;

public interface RequestHandler
{
  void handle(String action, Object payload);
}
