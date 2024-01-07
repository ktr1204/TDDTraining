    protected enum Fruits {
        Banana("Okinawa")
        Orange("Ehime"),
        Apple("Aomori");

      private String madein; // フィールドの定義
      private Fruit(String madein) { // コンストラクタの定義
          this.madein = madein;
        }
      }