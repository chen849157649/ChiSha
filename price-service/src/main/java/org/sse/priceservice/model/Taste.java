package org.sse.priceservice.model;


import lombok.Data;

/**
 * @author HPY
 */
@Data
public class Taste {

  private long tasteId;
  private String tasteName;


  public long getTasteId() {
    return tasteId;
  }

  public void setTasteId(long tasteId) {
    this.tasteId = tasteId;
  }


  public String getTasteName() {
    return tasteName;
  }

  public void setTasteName(String tasteName) {
    this.tasteName = tasteName;
  }

}
