package bridge;

public class SimpleDisplay implements Display {

  @Override
  public void title(Draft draft) {
    System.out.println(draft.getTitle());
  }// title

  @Override
  public void author(Draft draft) {
    System.out.println(draft.getAuthor());
  }// author

  @Override
  public void content(Draft draft) {
    String[] contents = draft.getContent();
    for (String content : contents) {
      System.out.println(content);
    } // for
  }// content

}// SimpleDisplay
