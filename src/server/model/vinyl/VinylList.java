package server.model.vinyl;

import server.model.user.UserClient;
import server.model.vinyl.states.Borrowed;
import server.model.vinyl.states.VinylState;

import java.util.ArrayList;

public class VinylList
{
  public ArrayList<Vinyl> vinylList;

  private VinylList(){
    vinylList = new ArrayList<>();
  }

  public ArrayList<Vinyl> getAllVinyls(){
    return vinylList;
  }

  public void ReserveVinyl(Vinyl vinyl, UserClient client){

  }

}
