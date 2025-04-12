package server.model.vinyl.states;

import server.model.vinyl.Vinyl;
import server.model.vinyl.VinylList;

public interface VinylState
{
  public void rentVinyl(Vinyl vinyl);
  public void reserveVinyl(Vinyl vinyl);
  public void returnVinyl(Vinyl vinyl);
}
