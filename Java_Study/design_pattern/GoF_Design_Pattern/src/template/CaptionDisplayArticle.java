package template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {

  public CaptionDisplayArticle(Article article) {
    super(article);
  }

  @Override
  protected void title() {
    System.out.println("TITLE: " + article.getTitle());
  }// title

  @Override
  protected void content() {
    System.out.println("CONTENT: ");
    ArrayList<String> contents = article.getContent();
    for (String content : contents) {
      System.out.println("    " + content);
    } // for
  }// content

  @Override
  protected void footer() {
    System.out.println("FOOTER: " + article.getFooter());
  }// footer
}// CaptionDisplayArticle
