# design-pattern
### 設計模式是什麼
* 設計模式（design pattern）是對軟體設計中普遍存在（反覆出現）的各種問題，所提出的解決方案。
### 綱要
《物件導向軟體工程》課程的學習心路歷程以及筆記
### 上課教材
* 《Design Patterns: Elements of Reusable Object-Oriented Software》
* 《Object-Oriented Software Engineering》
### 課程綱要
[file-pdf](https://skwen.s3-ap-northeast-1.amazonaws.com/10913129.pdf)<br>
### 學習資料
菜鳥教程 https://www.runoob.com/design-pattern/design-pattern-tutorial.html
<br>
尚硅谷 https://www.bilibili.com/video/BV1G4411c7N4
<br>
google雲端 https://drive.google.com/drive/folders/0B43NiF-IV-dQUDN0OWk4NHFfcEk?fbclid=IwAR1lIB0XSWB3Rr1zqrXlzb-9uXwSTjgjwnH-t7WnUI-RrCRkhHLcJuJbdQQ
<br>
### 設計模式分為哪幾種？
* 結構型模式：
Composite、Decorator、Bridge、Flyweight、Adapter、Proxy、Facade
* 行為型模式：
Strategy、Command、Iterator、Visitor、State、Memento、Observer、Chain of responsibility、Interpreter、TemplateMethod、Mediator
* 創建型模式：
SimpleFactory、FactoryMethod、AbstractFactory、Singleton、Builder、Prototype
### 目錄
* Composite-組合模式<br>
 結構型模式，用於解決文本編輯器裡的 “文檔結構” 問題 
 將對象組合成樹形結構以表示 “部分-整體” 的層次結構。<br>
* Strategy-策略模式<br>
 行為型模式，用於解決課本上的 “格式化” 問題。<br>
 定義一系列的算法，把它們一個個封裝起來，並且使它們可互相替換，本模式使得算法可獨立于客戶而變化。<br>
* Decorator-裝飾者模式<br>
 結構型模式，用於解決課本上 “修飾用戶界面” 問題。<br>
 動態的給一個對象添加一些額外的職責而不需要添加子類。就增加功能來說，Decorator模式相比生成子類更為靈活。 
* SimpleFactory-簡單工廠模式<br>
簡單工廠其實不是設計模式，反而比較像是一種變成習慣。
通過一個工廠類直接實現create方法 。
* FactoryMethod-工廠方法模式<br>
創建型模式，定義一個用於創建對象的接口，讓子類決定實例化哪一個類，使得一個類的實例化延遲到其子類。<br>
* AbstractFactory-抽象工廠模式<br>
創建型模式，用於解決書本上的 “支持多種視感標準” 問題。
提供一個接口以創建一系列相關或相互依賴的對象，而無須指定他們具體的類。<br>
* Bridge-橋接模式<br>
結構型模式，用於解決課本上 “支持多種窗口系統” 問題
將抽象部分與它的實現部分分離，使它們可以獨立的變化。<br>
* Command-命令模式<br>
行為型模式，用於解決課本上 “用戶操作” 問題。
將一個請求封裝為對象，從而使你可用不同的請求對客戶進行參數化，對請求排隊或記錄請求日誌，以及支持可撤銷的操作。<br>
* Iterator-迭代器模式<br>
行為型模式，用於解決課本 “拼寫檢查和連字符” 問題。
提供一種方法順序訪問一個聚合對象中的各個元素，而又不需要暴露該對象的內部表示。<br>
* Visitor-訪問者模式<br>
行為型模式，用於解決課本上 “拼寫檢查和連字符” 問題。
表示一個作用於某對象結構中的各元素的操作，它使你可以在不改變元素的類的前提下定義作用於這些元素的新操作。<br>
* Singleton-單體模式<br>
 創建型模式，保證一個類僅有一個實例，並提供一個訪問它的全局訪問點。<br>
* State-狀態模式<br>
 行為型模式，允許一個對象在其內部狀態改變時改變它的行為<br>
* Builder 構造者模式<br>
 創建型模式，將一個複雜對象的構建與它的表示分離，使得同樣的構建過程可以創建不同的表示。<br>
* Flyweight-享元模式<br>
結構型模式，運用共享技術有效地支持大量細粒度的對象。
主要用於減少創建對象的數量，以減少內存佔用和提高性能。<br>
* Memento-備忘錄模式<br>
行為型模式，在不破壞封裝的前提下，捕獲一個對象的內部狀態，並在該對象之外保存這個狀態。這樣以後就可將該對象恢復到原先保存的狀態。<br>
* Observer-觀察者模式<br>
行為型模式，定義對象間的一種一對多的依賴關係，當一個對象的狀態發生改變時，所有依賴於它的對象都得到通知並自動更新。<br>
* Adapter-適配器模式<br>
結構型模式，將一個類的接口轉換成客戶希望的另外一個接口.Adapter模式使得原本由於接口不兼容而不能一起工作的那些類可以一起工作。<br>
* Chain of Responsibility-責任鏈模式<br>
 行為型模式，使多個對象都有機會處理請求，從而避免請求的發送者和接收者之間的耦合關係。將這些對象連成一條鏈，並沿著這條鏈傳遞該請求，直到有一個對象處理它為止。<br>
* Interpreter-解釋器模式<br>
行為型模式，給定一個語言，定義它的文法的一種表示，並定義一個解釋器，這個解釋器使用該表示來解釋語言中的句子。<br>
* Template method-模板方法<br>
行為型模式，定義一個操作中的算法的骨架，而將一些步驟延遲到子類中。TemplateMethod使得子類可以不改變一個算法的結構即可重定義該算法的某些特定步驟。<br>
尽可能减少抽象方法，尽可能用钩子方法来代替。<br>
* Prototype-原型模式<br>
創建型模式，用原型實例指定創建對象的種類，並且通過拷貝這些原型創建新的對象<br>
* Proxy-代理模式<br>
 結構型模式，為其他對象提供一種代理以控制對這個對象的訪問<br>
### Contact Author
石桂華(Skwen) https://i.iskwen.com
# END
* Thank you for watching.
