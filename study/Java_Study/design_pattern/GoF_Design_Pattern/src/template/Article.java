package template;

import java.util.ArrayList;

public class Article {
  private String title;
  private ArrayList<String> content;
  private String footer;

  public Article(String title, ArrayList<String> content, String footer) {
    this.title = title;
    this.content = content;
    this.footer = footer;
  }

  public String getTitle() {
    return title;
  }// getTitle

  public ArrayList<String> getContent() {
    return content;
  }// getContent

  public String getFooter() {
    return footer;
  }// getFooter
}// Article
