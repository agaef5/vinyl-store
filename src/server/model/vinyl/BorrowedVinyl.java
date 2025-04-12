package server.model.vinyl;

import java.util.Date;

public class BorrowedVinyl
{
  private Vinyl vinyl;
  private Date lendDate;
  private Date returnDate;

  public BorrowedVinyl(Vinyl vinyl, Date lendDate, Date returnDate)
  {
    this.vinyl = vinyl;
    this.lendDate = lendDate;
    this.returnDate = returnDate;
  }

  public Vinyl getVinyl()
  {
    return vinyl;
  }

  public void setVinyl(Vinyl vinyl)
  {
    this.vinyl = vinyl;
  }

  public Date getLendDate()
  {
    return lendDate;
  }

  public void setLendDate(Date lendDate)
  {
    this.lendDate = lendDate;
  }

  public Date getReturnDate()
  {
    return returnDate;
  }

  public void setReturnDate(Date returnDate)
  {
    this.returnDate = returnDate;
  }
}
