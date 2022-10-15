package bridge;

public class CaptionDisplay implements Display {

  @Override
  public void title(Draft draft) {
    System.out.println("제목: " + draft.getTitle());
  }// title

  @Override
  public void author(Draft draft) {
    System.out.println("저자: " + draft.getAuthor());
  }// author

  @Override
  public void content(Draft draft) {
    System.out.println("내용: ");
    String[] contents = draft.getContent();
    for (String content : contents) {
      System.out.println("    " + content);
    } // for
  }// content

}// CaptionDisplay
