package tv.inair.layeredtemplate.modelview;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Html;

import java.util.Random;

import inair.data.ViewModel;
import tv.inair.apptemplate.R;
import tv.inair.layeredtemplate.Application;

/**
 * Implementation of view model
 * Should be used to declare all properties which are using to bind in layout
 * Logic code to manipulate data must be declare here
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class MainViewModel extends ViewModel {

  //region IMAGE PROPERTIES
  //region Alpha
  private float imageAlpha = 0.2f;

  public float getImageAlpha() {
    return imageAlpha;
  }

  public void setImageAlpha(float imageAlpha) {
    this.imageAlpha = imageAlpha;
    notifyPropertyChanged("imageAlpha");
  }
  //endregion

  //region Size
  private float imageWidth = 100.0f;

  public float getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(float imageWidth) {
    this.imageWidth = imageWidth;
    notifyPropertyChanged("imageWidth");
  }

  private float imageHeight = 100.0f;

  public float getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(float imageHeight) {
    this.imageHeight = imageHeight;
    notifyPropertyChanged("imageHeight");
  }
  //endregion

  //region Position
  private float imagePositionX = 100.0f;

  public float getImagePositionX() {
    return imagePositionX;
  }

  public void setImagePositionX(float imagePositionX) {
    this.imagePositionX = imagePositionX;
    notifyPropertyChanged("imagePositionX");
  }

  private float imagePositionY = 100.0f;

  public float getImagePositionY() {
    return imagePositionY;
  }

  public void setImagePositionY(float imagePositionY) {
    this.imagePositionY = imagePositionY;
    notifyPropertyChanged("imagePositionY");
  }

  private float imagePositionZ = 100.0f;

  public float getImagePositionZ() {
    return imagePositionZ;
  }

  public void setImagePositionZ(float imagePositionZ) {
    this.imagePositionZ = imagePositionZ;
    notifyPropertyChanged("imagePositionZ");
  }
  //endregion

  //region Source
  private BitmapDrawable imageSrc = null;

  public BitmapDrawable getImageSrc() {
    return imageSrc;
  }

  public void setImageSrc(BitmapDrawable imageSrc) {
    this.imageSrc = imageSrc;
    notifyPropertyChanged("imageSrc");
  }
  //endregion
  //endregion

  //region TEXT PROPERTIES
  //region Alpha
  private float textAlpha = 0.2f;

  public float getTextAlpha() {
    return textAlpha;
  }

  public void setTextAlpha(float textAlpha) {
    this.textAlpha = textAlpha;
    notifyPropertyChanged("textAlpha");
  }
  //endregion

  //region Size
  private float textWidth = 100.0f;

  public float getTextWidth() {
    return textWidth;
  }

  public void setTextWidth(float textWidth) {
    this.textWidth = textWidth;
    notifyPropertyChanged("textWidth");
  }

  private float textHeight = 100.0f;

  public float getTextHeight() {
    return textHeight;
  }

  public void setTextHeight(float textHeight) {
    this.textHeight = textHeight;
    notifyPropertyChanged("textHeight");
  }
  //endregion

  //region Color
  private int textColor = Color.CYAN;

  public int getTextColor() {
    return textColor;
  }

  public void setTextColor(int textColor) {
    this.textColor = textColor;
    notifyPropertyChanged("textColor");
  }
  //endregion

  //region TextContent
  private CharSequence textContent = Html.fromHtml("<p>Normal text. <b>Bold text</b><i>Italic text</i><br/><u>Underline</u><ul><li>a</li><li>b</li></ul></p>");

  public CharSequence getTextContent() {
    return textContent;
  }

  public void setTextContent(CharSequence textContent) {
    this.textContent = textContent;
    notifyPropertyChanged("textContent");
  }
  //endregion

  //region TextSize
  private float textSize = 25.0f;

  public float getTextSize() {
    return textSize;
  }

  public void setTextSize(float textSize) {
    this.textSize = textSize;
    notifyPropertyChanged("textSize");
  }
  //endregion

  //region Position
  private float textPositionX = 100.0f;

  public float getTextPositionX() {
    return textPositionX;
  }

  public void setTextPositionX(float textPositionX) {
    this.textPositionX = textPositionX;
    notifyPropertyChanged("textPositionX");
  }

  private float textPositionY = 100.0f;

  public float getTextPositionY() {
    return textPositionY;
  }

  public void setTextPositionY(float textPositionY) {
    this.textPositionY = textPositionY;
    notifyPropertyChanged("textPositionY");
  }

  private float textPositionZ = 100.0f;

  public float getTextPositionZ() {
    return textPositionZ;
  }

  public void setTextPositionZ(float textPositionZ) {
    this.textPositionZ = textPositionZ;
    notifyPropertyChanged("textPositionZ");
  }
  //endregion
  //endregion

  private CharSequence descText = "";

  public CharSequence getDescText() {
    return descText;
  }

  public void setDescText(CharSequence descText) {
    this.descText = descText;
    notifyPropertyChanged("descText");
  }

  int[] colorValues = new int[]{Color.BLUE, Color.CYAN, Color.GRAY, Color.YELLOW, Color.RED};
  CharSequence[] textValues = new CharSequence[]{
    Html.fromHtml("<p>Normal<b>Bold</b><i>Italic</i><br/><u>Underline</u><ul><li>a</li><li>b</li></ul></p>"),
    Html.fromHtml("<p>Normal text. Bold text. Italic text. Underline<.</p>"),
    Html.fromHtml("<p>Normal text. <b>Bold text</b><i>Italic text</i><br/><u>Underline</u><ul><li>a</li><li>b</li></ul></p>"),
    Html.fromHtml("<p>text</p>"),
    Html.fromHtml("<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nec porta nisi, et faucibus felis. Pellentesque suscipit euismod velit, sit amet tristique lectus euismod iaculis. Donec porttitor luctus tincidunt. Maecenas volutpat non sem vitae cursus. Suspendisse potenti. Sed lorem lacus, pulvinar id ante non, lobortis euismod metus. Aenean non sapien at dui tempor mattis. Vestibulum lacinia consequat magna, vitae blandit libero egestas ac. Suspendisse velit tortor, adipiscing vel aliquet nec, cursus blandit dolor. Integer dui nibh, feugiat et fringilla vel, vulputate ut nisl. In dictum odio id justo posuere mattis. Nulla lacinia rutrum interdum. Aliquam quis nunc mi. Maecenas gravida sem vel commodo ornare. Aliquam sodales libero non lorem pulvinar rhoncus. Suspendisse potenti.</p>")
  };

  int[] imageRes = new int[]{ R.drawable.f1, R.drawable.facebook, R.drawable.ic_launcher, R.drawable.jaguar, R.drawable.keywords, R.drawable.redbull };

  Resources res;

  public MainViewModel() {
    res = Application.getAppContext().getResources();
    setImageSrc(((BitmapDrawable) res.getDrawable(imageRes[0])));
  }

  public void randomValue() {
    Random r = new Random();
    setImageWidth(r.nextInt(1920));
    setImageHeight(r.nextInt(1080));
    setImageAlpha(r.nextFloat());
    setImagePositionX(r.nextInt(1920));
    setImagePositionY(r.nextInt(1080));
    setImagePositionZ(r.nextInt(200) - 100);
    setImageSrc(((BitmapDrawable) res.getDrawable(imageRes[r.nextInt(imageRes.length)])));
    setTextAlpha(r.nextFloat());
    setTextColor(colorValues[r.nextInt(colorValues.length)]);
    setTextContent(textValues[r.nextInt(textValues.length)]);
    setTextSize(r.nextInt(20) + 30);
    setTextPositionX(r.nextInt(1920));
    setTextPositionY(r.nextInt(1080));
    setTextPositionZ(r.nextInt(200) - 100);
  }
}
