package webElement;

public enum Condition {
    visible("visible"),
    VISIBLE ("visible");


    private String title;

    Condition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
