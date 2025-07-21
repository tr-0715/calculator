# Web電卓アプリ（Spring Boot）

このアプリは Spring Boot を使用して作成した Webベースの電卓です。  
2つの数値と演算子（+、−、×、÷）を入力すると、計算結果が画面に表示されます。

---

## 使用技術

- Java 17
- Spring Boot 3.x
- Thymeleaf
- Maven
- Eclipse IDE

---

## 起動方法

1. このリポジトリをクローンします：
git clone https://github.com/your-username/calculator.git
2. Eclipse などのIDEで Maven プロジェクトとしてインポート

3. CalculatorApplication.java を実行

4. 以下のURLにアクセス：http://localhost:8081

フォルダ構成
calculator/
├── java/com/example/calculator/   # コントローラー・ロジック
├── resources/templates/           # index.html（Thymeleaf）
├── application.properties         # ポート設定など
└── pom.xml                        # 依存関係

 機能
・数値入力
・演算子選択（+ - × ÷）
・結果表示

入力チェック＆エラーメッセージ対応

今後の追加予定
・小数点やマイナス対応の強化
・計算履歴の保存

