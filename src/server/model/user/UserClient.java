package server.model.user;

import server.model.vinyl.BorrowedVinyl;
import server.model.vinyl.Vinyl;

public class UserClient
{
  private String username;
  private String password;
  private Vinyl reservedVinyl;
  private BorrowedVinyl borrowedVinyl;

  public UserClient(String username, String password)
  {
    this.username = username;
    this.password = password;
    reservedVinyl = null;
    borrowedVinyl = null;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public Vinyl getReservedVinyl()
  {
    return reservedVinyl;
  }

  public void setReservedVinyl(Vinyl reservedVinyl)
  {
    if(this.reservedVinyl == null)
      this.reservedVinyl = reservedVinyl;
  }

  public BorrowedVinyl getBorrowedVinyl()
  {
    return borrowedVinyl;
  }

  public void setBorrowedVinyl(BorrowedVinyl borrowedVinyl)
  {
    this.borrowedVinyl = borrowedVinyl;
  }

  public void returnVinyl(){
    borrowedVinyl = null;
  }
}
