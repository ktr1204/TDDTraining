public enum Card {
    CLOVER("Okinawa"),
    DIAMOND("Ehime"),
    HEART("Ehime"),
    CLUB("Aomori");
        // フィールド
    private final double s;

    // コンストラクタ
    private Card(double s) {
        this.s = s;
    }
}