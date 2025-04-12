package server.model.vinyl;

import server.model.vinyl.states.Available;
import server.model.vinyl.states.VinylState;

public class Vinyl
{
  private String title;
  private String author;
  private int releaseYear;
  private boolean toBeRemoved;
  private VinylState vinylState;

  public Vinyl(String title, String author, int releaseYear)
  {
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.toBeRemoved = false;
    vinylState = new Available();
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getAuthor()
  {
    return author;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public int getReleaseYear()
  {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear)
  {
    this.releaseYear = releaseYear;
  }

  public boolean isToBeRemoved()
  {
    return toBeRemoved;
  }

  public void setToBeRemoved(boolean toBeRemoved)
  {
    this.toBeRemoved = toBeRemoved;
  }

  public VinylState getVinylState()
  {
    return vinylState;
  }

  public void setVinylState(VinylState vinylState)
  {
    this.vinylState = vinylState;
  }
}
