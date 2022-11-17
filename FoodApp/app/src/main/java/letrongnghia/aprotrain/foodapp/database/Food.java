package letrongnghia.aprotrain.foodapp.database;

public class Food {
    int resId;
    String title;
    String content;
    float price;

    public Food (int resId){
        this.resId = resId;
    }

    public Food(int resId, String title, String content, float price) {
        this.resId = resId;
        this.title = title;
        this.price = price;
        this.content = content;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
