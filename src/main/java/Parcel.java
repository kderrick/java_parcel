public class Parcel {
  private int mLength;
  private int mWidth;
  private int mHeight;
  private int mWeight;
  private int mVolume;

  public Parcel(int length, int width, int height, int weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }


  public Integer getVolume() {
    return mVolume = mLength * mWidth * mHeight;
  }



  public Integer costToShip() {
    Integer shippingCost = getVolume() * mWeight;
    return shippingCost;
  }
}
