public class Card{
    protected enum Card {
    Banana("Okinawa"),
    Orange("Ehime"),
    Apple("Aomori");

    private String madein; // フィールドの定義
    private Card(String madein) { // コンストラクタの定義
        this.madein = madein;
    }
}
}