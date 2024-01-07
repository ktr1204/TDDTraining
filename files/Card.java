public enum Card {
    CLOVER("Okinawa"),
    DIAMOND("Ehime"),
    HEART("Ehime"),
    CLUB("Aomori");
        // フィールド
    private final String s;

    // コンストラクタ
    private Card(String s) {
        this.s = s;
    }
}