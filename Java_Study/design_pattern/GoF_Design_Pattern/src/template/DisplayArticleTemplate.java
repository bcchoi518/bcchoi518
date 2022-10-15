package template;

public abstract class DisplayArticleTemplate {
  protected Article article;

  public DisplayArticleTemplate(Article article) {
    this.article = article;
  }

  public final void display() { // final로 지정해서 오버라이딩 불가
    title();
    content();
    footer();
  }

  protected abstract void title();

  protected abstract void content();

  protected abstract void footer();
}// DisplayArticleTemplate
