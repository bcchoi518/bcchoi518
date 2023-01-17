package bridge;

public class MainEntry {
  public static void main(String[] args) {
    String title = "복원된 지구";
    String author = "김형준";
    String[] content = {
        "플라스틱 사용의 감소와",
        "바다 생물 어획량 감소로 인하여",
        "지구는 복원되었다."
    };

    Draft draft = new Draft(title, author, content);

    Display display1 = new SimpleDisplay();
    // draft.print(display1);

    Display display2 = new CaptionDisplay();
    // draft.print(display2);

    String publisher = "북악출판";
    int cost = 100;

    Publication publication = new Publication(title, author, content, publisher, cost);
    publication.print(display1);
  }// main
}// MainEntry
