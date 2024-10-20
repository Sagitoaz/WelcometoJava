**A/ Sơ lược về Java**  
**I/ Java là gì**  
Java là một ngôn ngữ lập trình hướng đối tượng, mạnh mẽ và linh hoạt, được phát triển bởi Sun Microsystems vào năm 1995 (hiện thuộc sở hữu của Oracle). Java nổi tiếng với phương châm "Viết một lần, chạy mọi nơi" (Write Once, Run Anywhere - WORA), có nghĩa là một chương trình viết bằng Java có thể chạy trên bất kỳ nền tảng nào mà không cần phải biên dịch lại, miễn là có máy ảo Java (JVM - Java Virtual Machine) phù hợp.  
Một số đặc điểm chính của ngôn ngữ Java:  
1.Đa nền tảng: Java có khả năng chạy trên nhiều hệ điều hành khác nhau, nhờ JVM.  
2.Hướng đối tượng: Java tuân thủ nguyên tắc lập trình hướng đối tượng (OOP), giúp việc xây dựng, bảo trì và phát triển phần mềm trở nên dễ dàng hơn.  
3.Bảo mật: Java được thiết kế với các tính năng bảo mật mạnh mẽ, bảo vệ hệ thống khỏi các cuộc tấn công và xâm nhập.  
4.Quản lý bộ nhớ tự động: Java có hệ thống quản lý bộ nhớ tự động (Garbage Collection), giúp giảm thiểu nguy cơ rò rỉ bộ nhớ.    
5.Thư viện phong phú: Java đi kèm với một bộ thư viện lớn hỗ trợ nhiều chức năng lập trình như mạng, đồ họa, và cơ sở dữ liệu.    
Java được sử dụng trong nhiều lĩnh vực khác nhau, bao gồm phát triển ứng dụng web, ứng dụng di động (đặc biệt là Android), và các hệ thống doanh nghiệp lớn.  
**II/ Lí do ra đời Java**  
Java ra đời vào đầu những năm 1990 với mục đích ban đầu là tạo ra một ngôn ngữ lập trình có thể vận hành trên nhiều thiết bị khác nhau, đặc biệt là các thiết bị điện tử gia dụng. Một số lý do chính dẫn đến sự ra đời của Java bao gồm:  
1.Nhu cầu về một ngôn ngữ đa nền tảng  
2.Giải quyết những hạn chế của C++  
3.Phát triển ứng dụng cho thiết bị nhúng  
4.Tăng cường bảo mật  
5.Tạo ra một ngôn ngữ đơn giản và dễ học  
**III/ Cách Java hoạt động**  
Tóm tắt quá trình khi chạy code Java:  
1.Viết mã nguồn (.java).  
2.Biên dịch mã nguồn thành bytecode (.class) sử dụng javac.  
3.Tải bytecode vào JVM qua Class Loader.  
4.Kiểm tra bytecode để đảm bảo tính hợp lệ.  
5.Thực thi bytecode bởi JVM (qua thông dịch hoặc biên dịch JIT).  
6.Quản lý bộ nhớ tự động qua Garbage Collector.  
**IV/ Cấu trúc chương trình Java**  
Cấu trúc cơ bản của chương trình Java như sau:  
```java
public class ClassName{
  public static void main(String[] args){
    //Các câu lệnh xử lý
  }
}
```
Bao gồm:  
•	package: Một package (gói) mô tả không gian tên có chứa các lớp của Java, sử dụng ký tự thường và dấu chấm để định nghĩa tên, chúng ta có thể xem package như là một thư mục, còn class chính là các file trực thuộc thư mục.  
•	import: Từ khóa được sử dụng trong Java nhằm để xác định các class hoặc các package được sử dụng trong lớp này.  
•	class: Từ khóa nhằm để định nghĩa lớp của Java. Nó đứng trước khai báo tên lớp của Java. Ngoài ra còn có từ khóa public, từ khóa này xác định phạm vi truy cập của lớp. Đặc tính này chính là tính đóng gói trong lập trình hướng đối tượng. (chúng ta sẽ tìm hiểu phần này ở các bài sau)  
•	variables: Biến hay còn gọi là trường, cũng có một số tài liệu gọi là thuộc tính trực thuộc lớp. Nó chứa thông tin cụ thể liên quan tới các đối tượng là thể hiện của lớp.  
•	methods: Phương thức hay còn gọi là hàm chứa các hành động thực thi của đối tượng. Đương nhiên nội dung của phương thức chính là các đoạn mã thực thi của chính phương thức này.  
•	constructors : Phương thức khởi tạo (Hay hàm khởi tạo) của đối tượng. Hình dạng của đối tượng được thể hiện ra sao sẽ phụ thuộc vào phương thức này.  
**V/ Package**  
**1.Khái niệm về package trong java**  
Một Package (gói) trong Java là một nhóm các class, interface và các package con tương tự, liên quan đến nhau.  
Chúng ta có thể coi package giống như là một folder vậy.  
Các package trong Java được sử dụng để tránh việc xung đột trong khi đặt tên, để kiểm soát truy cập, giúp bạn tìm kiếm và sử dụng các class, interface… một các dễ dàng hơn.  
Các package được chia làm hai loại:  
- Các package được tích hợp sẵn từ Java API (Built-in packages)  
- Các package do người dùng tự định nghĩa (đây là package do bạn tự tạo ra) – User defined packages  
**2.Các package có sẵn trong Java API**  
Package trong java được chia làm 2 loại:  
•	Một loại được tích hợp từ Java API  
•	Loại package thứ 2 là package do người dùng tự định nghĩa.  
Vậy các package hay dùng (phổ biến) được tích hợp sẵn trong Java bao gồm:  
•	java.lang: Chứa các lớp hỗ trợ ngôn ngữ (ví dụ: lớp được định nghĩa các kiểu dữ liệu nguyên thủy, các phép toán). Package này được import tự động.  
•	java.io: Chứa lớp để hỗ trợ input / output (I/O)  
•	java.util: Chứa các lớp tiện ích thực hiện các cấu trúc dữ liệu như danh sách liên kết, dictionary và hỗ trợ cho các hoạt động date / time.  
•	java.applet: Chứa các lớp để tạo Applet.  
•	java.awt: Chứa các class để triển khai các thành phần cho giao diện người dùng đồ họa (ví dụ như button, menu,…).  
•	java.net: Chứa các lớp để hỗ trợ các thao tác trong mạng (network).

**B/ Syntax cơ bản**  
**I/ Khai báo biến nguyên thủy**  
Các BIẾN là nơi để lưu dữ liệu trong quá trình ứng dụng thi hành, biến có tên biến (ví dụ age, name ...) dùng để lưu dữ liệu vào đó và lấy dữ liệu từ đó ra, mỗi biến cũng thuộc về một KIỂU DŨ LIỆU cho biết loại dữ liệu mà biến có thể lưu giữ (số nguyên, số thực ...)  
Một số kiểu dữ liệu trong Java như:  

|  Kiểu dữ liệu |   |
|---|---|
|Strin|kiểu dữ liệu lưu trữ chuỗi, ví dụ : "Hello" ...|
|int|kiểu dữ liệu số nguyên như số -123, 400 ...  |
|double|kiểu dữ liệu số thực 1.223 ...|
|char|kiểu dữ liệu lưu ký tự: ví dụ 'A', 'x' ...|
|Boolean|lưu giá trị logic nhận giá trị true hoặc false|


Để khai báo một biến cần chỉ ra kiểu dữ liệu và tên biến theo cấu trúc:  
String varname;  
Trước khi biến được sử dụng cần gán cho nó một giá trị cụ thể bằng phép gán (=), bạn cũng có thể khởi tạo ngay cho nó một giá trị bạn đầu ngay từ lúc khai báo biến, ví dụ:  
int numberDays = 30; //Biến kiểu số nguyên, khởi tạo cho nó giá trị 30  
Tên của biến: tên biến do bạn đặt, chỉ cần tuân thủ những điều sau thì tên là hợp lệ trong Java  
•	Không được dùng từ khóa dành riêng cho ngôn ngữ Java để đặt như if , void , class ...  
•	Tên biến phải bắt đầu bằng một chữ cái hoặc _ hoặc $  
•	Tên biến không được chứa ký tự đặc biệt, khoảng trắng: như %^&#  
•	Trong tên biến có thể chứa số, nhưng không được bắt đầu bằng số: ví dụ 7up là tên sai, nhưng up7 thì được  
Chú ý mỗi biến chỉ lưu được đúng các giá trị phù hợp với kiểu dữ liệu của nó. Khai báo là số nguyên thì không thể bắt nó (gán) lưu số thực, chuỗi ...  
Kiểu dữ liệu nguyên thủy Java  
Với Java là ngôn ngữ lập trình hướng đối tượng, hầu hết mọi thứ đều là hướng đối tượng tạo ra từ lớp, cấu trúc ... Tuy nhiên có các dữ liệu gọi là kiểu dữ liệu nguyên thủy không phải là đối tượng lớp. Biến kiểu dữ liệu này chỉ lưu một giá trị đơn giản và không cho phép định nghĩa toán tử mới. Chi tiết hơn thì kiểu dữ liệu nguyên thủy được lưu ở bộ nhớ Stack (các đối tượng thì ở bộ nhớ Heap) Tám kiểu dữ liệu nguyên thủy JAVA là:  
| Kiểu  |  Mô tả | Mặc định  | Cỡ  |
|---|---|---|---|
|  boolean |  true hoặc false |false|1 bit|
| byte  | Số nguyên từ -128 .. 127  | 0  | 8 bits  |
|char|Ký tự Unicode|\u0000|16 bits|
|short|Số nguyên giá trị từ -32768 .. 32767|0|16 bits|
|int|Số nguyên -2,147,483,648 ..2,147,483,647|0|32 bits|
|long|Số nguyên dài|0|64 bits|
|float|Số thực|0.0|32 bits|
|double|Số thực|0.0|64 bits|

**II/ Nhập – Xuất**  
**1.Xuất (output) trong Java**  
Trong Java, chúng ta có thể sử dụng các hàm bên dưới để xuất dữ liệu ra màn hình.  
```java
System.out.println();
System.out.print();
System.out.printf();
```
Sự khác nhau giữa các hàm println(), print() và printf()  
•	print(): in ra một chuỗi bên trong dấu ngoặc kép “”  
•	println(): in ra một chuỗi giống như hàm print(). Sau đó, tự động xuống dòng mới.  
•	printf(): in ra chuỗi với việc cung cấp các định dạng khác nhau giống như hàm printf trong C/C++.  
**2.Nhập (input) trong Java**  
Trong Java, chúng ta có thể sử dụng đối tượng của lớp Scanner để lấy giá trị được nhập vào bởi người dùng.  
Đầu tiên, cần import gói java.util.Scanner.  
```java
import java.util.Scanner;
```
Sau đó, cần tạo một đối tượng của lớp Scanner. Đối tượng này sẽ giúp chúng ta lấy giá trị nhập vào của người dùng.  
```java
// create an object of Scanner
Scanner input = new Scanner(System.in);

// take input from the user
int number = input.nextInt();
Các phương thức của lớp Scanner
```
|  Phương thức | Mô tả  |
|---|---|
| nextByte()  |  Đọc một số nguyên kiểu byte |
|nextShort()|Đọc một số nguyên kiểu short|
|nextInt()|Đọc một số nguyên kiểu int|
|nextLong()|Đọc một số nguyên kiểu long|
|nextFloat()|Đọc một số kiểu float|
|nextDouble()|Đọc một số kiểu double|
|next()|Đọc một string kết thức trước một ký tự trắng|
|nextLine()|Đọc một line of text (kết thúc bằng phím Enter)|

**III/ Vòng lặp trong Java**  
**1.Vòng lặp for trong Java**  
Vòng lặp for được sử dụng để chạy một khối code trong một số lần nhất định. Cú pháp:  
```java
for (<khởi đầu>; <điều kiện lặp>; <bước nhảy>) {
    //code block 
}
```
Nguyên lý hoạt động của vòng lặp for như sau:  
<khởi đầu> khởi tạo giá trị của biến và chỉ thực thi một lần duy nhất. Sau đó, nếu <điều kiện lặp> đúng (true) thì thực thi các dòng lệnh trong vòng lặp for. Nếu <điều kiện lặp> sai (false) thì kết thúc vòng lặp.  
<bước nhảy> sẽ thay đổi giá trị của biến lúc <khởi đầu>. Giá trị của biến này sẽ được kiểm tra lại (kiểm tra <điều kiện lặp>) sau mỗi lần lặp.  
**2.Vòng lặp while trong Java**  
Vòng lặp while trong Java được sử dụng để lặp lại một khối lệnh nếu thỏa điều kiện nào đó. Cú pháp của vòng lặp while như sau:  
```java
while (<điều kiện lặp>)
{
	//code block
}
```
với <điều kiện lặp> thường là biểu thức với các toán tử quan hệ, kết quả trả về là true (0) hoặc false (0).  
Nguyên lý hoạt động của vòng lặp while như sau:  
Kiểm tra <điều kiện lặp>, nếu <điều kiện lặp> đúng (true) thì dòng lệnh trong while sẽ được thực thi.  
Quá trình kiểm tra <điều kiện lặp> và thực thi dòng lệnh trong while sẽ chấm dứt cho đến khi <điều kiện lặp> sai (false). Tức là, nếu bất cứ khi nào <điều kiện lặp> sai (false) thì vòng lặp while sẽ chấm dứt.  
**3.Vòng lặp do while trong Java**  
Vòng lặp do while cũng giống vòng lặp while nhưng khối lệnh trong vòng lặp thực hiện trước rồi mới kiểm tra điều kiện lặp sau. Cú pháp:  
```java
do {
   //code block
}while (<điều kiện lặp>);
```
với <điều kiện lặp> thường là biểu thức với các toán tử quan hệ, kết quả trả về là true (0) hoặc false (0).  
Nguyên lý hoạt động của vòng lặp do while như sau:  
Thực thi dòng lệnh trong do while trước. Sau đó, kiểm tra <điều kiện lặp>, nếu <điều kiện lặp> đúng (true) thì thực thi dòng lệnh trong do while lần nữa.  
Quá trình kiểm tra <điều kiện lặp> và thực thi dòng lệnh trong do while sẽ chấm dứt cho đến khi <điều kiện lặp> sai (false). Tức là, nếu bất cứ khi nào <điều kiện lặp> sai (false) thì vòng lặp do while sẽ chấm dứt.  
**IV/ Câu lệnh rẽ nhánh**  
**1/ Câu lệnh if – else**  
```java
class Main {
    public static void main(String[] args) {
        int number = 0;
        // checks if number is greater than 0
        if (number > 0) {
          System.out.println("The number is positive.");
        }
        // checks if number is less than 0
        else if (number < 0) {
          System.out.println("The number is negative.");
        }
        // if both condition is false
        else {
          System.out.println("The number is 0.");
        }
    }
}
```
**2/Câu lệnh switch case**  
Câu lệnh switch case cho phép lựa chọn một trong nhiều khối lệnh để thực hiện tùy vào biểu thức được lựa chọn.  
```java
class Main {
    public static void main(String[] args) {
        int number = 44;
        String size;
        // switch statement to check size
        switch (number) {
          case 29:
            size = "Small";
            break;
          case 42:
            size = "Medium";
            break;
          // match the value of week
          case 44:
            size = "Large";
            break;
          case 48:
            size = "Extra Large";
            break;

          default:
            size = "Unknown";
            break;
        }
        System.out.println("Size: " + size);
    }
}
```
**V/ Mảng**  
**1/ Mảng 1 chiều**  
•	Khai báo và khởi tạo mảng một chiều  
Cú pháp khai báo mảng một chiều:  
```java
elementType[] arrayRefVar;
elementType arrayRefVar[];
```
Trong đó, elementType có thể là kiểu dữ liệu nguyên thủy như int, char, double, byte,… hoặc các lớp (class) trong Java. arrayRefVar là tên mảng, có quy ước đặt tên giống tên biến.  
Để khai báo số phần tử có trong mảng, chúng ta cần phải cấp phát vùng nhớ cho mảng tương ứng với số phần tử mà có thể lưu trữ. Cú pháp:  
```java
arrayRefVar = new elementType[arraySize];
```
Sử dụng từ khóa new để cấp phát vùng nhớ cho mảng. Số vùng nhớ được cấp phát là arraySize, mỗi vùng nhớ có thể lưu trữ một giá trị kiểu elementType. Sau đó, gán mảng vừa tạo vào biến tham chiếu arrayRefVar.  
Khi một mảng được cấp phát, số lượng phần tử mảng là cố định và không thể thay đổi. Để lấy kích thước mảng, chúng ta dùng arrayRefVar.lenght.  
**2/ Mảng 2 chiều**  
Cú pháp khai báo mảng 2 chiều:  
```java
elementType[][] arrayRefVar;
elementType arrayRefVar[][];
```
**C/ Tổng quan về Class và Object**  
**I/ Class**  
**1.Lớp (class) là gì?**  
Lớp (class) là một thiết kế (blueprint), mẫu (prototype) cho các đối tượng cùng kiểu. Lớp có thể coi là khuôn mẫu để tạo các đối tượng. Ví dụ: Người, Xe, Động vật,…  
Lớp chính là kết quả của quá trình trừu tượng hóa dữ liệu:  
•	Lớp định nghĩa 1 kiểu dữ liệu mới, trừu tượng hóa 1 tập các đối tượng.  
•	Một đối tượng gọi là một thể hiện của lớp.  
Các thành phần của lớp  
Lớp đóng gói các thuộc tính (attribute) và phương thức (method) chung của các đối tượng.  

Thuộc tính: Một thuộc tính của một lớp là một trạng thái chung được đặt tên của lớp đó. Ví dụ: Lớp Ôtô có các thuộc tính: màu sắc, vận tốc, hãng sản xuất,…  
Mỗi đối tượng của lớp có các giá trị của thuộc tính khác nhau. Ví dụ: một chiếc Ôtô bạn đang sử dụng có thể có màu đen, vận tốc 60 km/h.  
Phương thức: Xác định các hoạt động chung mà tất cả các đối tượng của lớp thực hiện được. Ví dụ: Lớp Ôtô có các phương thức: tăng tốc độ, giảm tốc độ,…  
**2.Khai báo lớp (class) trong Java**  
Lớp sẽ nằm trong một package (gói) nào đó. Sử dụng từ khóa class để khai báo và định nghĩa lớp với cú pháp như sau:  
```java
accessmodifier class <Tên Lớp> {
	//các thuộc tính
	//các phương thức
}
```
accessmodifier gọi là chỉ định truy cập, accessmodifier của lớp (class) có thể là:  
•	public: lớp có thể được truy cập từ bất cứ đâu, kể cả bên ngoài package chứa lớp đó.  
•	mặc định (default): lớp có thể được truy cập từ bên trong package chứa lớp đó. Khi không ghi rõ accessmodifier cho lớp thì đó là mặc định.  
Lưu ý: Bên trên đang nói về accessmodifier của lớp (class), accessmodifier của các thuộc tính, phương thức trong lớp (class) có ý nghĩa khác, sẽ tìm hiểu ở phần kế thừa trong Java.  
Và accessmodifier protected và private không được sử dụng cho lớp trong Java. Nếu bạn cố sử dụng các accessmodifier này cho lớp thì chương trình sẽ báo lỗi “invalid modifier”.  
*Ví dụ:*  
```java
//Khai báo và định nghĩa lớp với accessmodifier mặc định.
package gochocit.Demo;
class Dog {
    //thuộc tính
    private String ten;
    private String maulong;
    //phương thức
    public void bark(){
        System.out.println("BARRRRK!");
    }
}
//Khai báo và định nghĩa lớp với accessmodifier public.
package gochocit.Demo;
public class Dog {
    //thuộc tính
    private String ten;
    private String maulong;
    //phương thức
    public void bark(){
        System.out.println("BARRRRK!");
    }
}
```
*Thuộc tính của lớp*  
Các thuộc tính phải được khai báo bên trong lớp. Mỗi đối tượng có bản sao các thuộc tính của riêng nó. Giá trị của một thuộc tính thuộc các đối tượng khác nhau là khác nhau.  
Bản chất của các thuộc tính là các thành phần dữ liệu của đối tượng. Khai báo tương tự như biến.  
Cú pháp khai báo thuộc tính:  
```java
accessmodifier kiểudữliệu tênThuộcTính;
```
Thuộc tính có thể được khởi tạo khi khai báo. Nếu không được khởi tạo thì các giá trị mặc định sẽ được sử dụng.  
*Phương thức của lớp*  
Phương thức xác định các hoạt động của lớp. Bất kỳ phương thức nào cũng phải thuộc về một lớp nào đó.  
Cú pháp khai báo phương thức:  
```java
accessmodifier kiểuTrảVề tênPhươngThức (ds tham số) {
	// Nội dung phương thức
}
```
Lưu ý: accessmodifier của các thuộc tính, phương thức trong lớp (class) có ý nghĩa khác với accessmodifier của lớp (class), sẽ tìm hiểu ở phần kế thừa trong Java.  
**II/ Object**  
**1.Khai báo và khởi tạo đối tượng trong Java**  
Một đối tượng (object) trong Java là một thực thể của lớp. Để khai báo một đối tượng thuộc lớp, ta sử dụng cú pháp:  
```java
<TênLớp> tên đối tượng;
```
*Ví dụ:*  
```java
Bicycle sportsBicycle;
BankAccount acc;
```
Chúng ta sử dụng toán tử new và gọi đến hàm khởi tạo (constructor) của lớp để khởi tạo đối tượng. Hàm constructor có tên trùng với tên của lớp.  
```java
sportsBicycle = new Bicycle();
acc = new BankAccount();
```
Khi khởi tạo, đối tượng được cấp phát một vùng nhớ riêng để lưu trữ các dữ liệu của đối tượng đó. Vùng nhớ lưu trữ các đối tượng là vùng nhớ heap.  
Lưu ý:  
Nếu không được khởi tạo thì đối tượng mang giá trị null.  
Khi đối tượng được khởi tạo, các thành phần dữ liệu (thuộc tính) của đối tượng được khởi tạo với giá trị mặc định của kiểu dữ liệu tương ứng.  
– Kiểu số (number data type) là 0.  
– Kiểu tham chiếu (reference type) là null.  
– Kiểu luận lý boolean là false.  
Chúng ta thường kết hợp khai báo và khởi tạo đối tượng trong 1 câu lệnh.  
```java
Bicycle sportsBicycle = new Bicycle();
BankAccount acc = new BankAccount();
```
**2.Truy cập đến thuộc tính và phương thức của đối tượng**  
Sử dụng toán tử chấm “.” để truy cập đến thuộc tính và phương thức của đối tượng. Nếu truy cập từ trong cùng một lớp thì có thể không cần dùng toán tử chấm “.”.  
Bên dưới là khai báo, định nghĩa lớp Lamp. Sau đó, khai báo và khởi tạo các đối tượng của lớp để sử dụng.  
```java
class Lamp {
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }
    // method to turnoff the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
class Main {
    public static void main(String[] args) {
        //tạo các đối tượng led và halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        
        led.turnOn();
        halogen.turnOff();
    }
}
```
Kết quả  
```java
Light on? true
Light on? false
```
Ở ví dụ trên, lớp Lamp được khai báo, định nghĩa. Sau đó, bên trong lớp Main, tạo các đối tượng led và halogen của lớp Lamp để sử dụng.  
**3.Đối tượng tự tham chiếu với từ khóa this**  
Hãy xem ví dụ bên dưới:  
```java
public class Account {
    String owner;
    long balance;
    
    void setAccountInfo(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }
}
```
Trong lớp Account, sử dụng tử khóa this để chỉ rõ các thuộc tính của lớp và gán giá trị cho chúng. Đó là tự tham chiếu với từ khóa this.  
Với từ khóa this, cho phép truy cập vào đối tượng hiện tại của lớp, nhằm xóa đi sự nhập nhằng giữa biến cục bộ, tham số với thành phần dữ liệu lớp. Đặc biệt, trong trường hợp chúng cùng tên với nhau.  
Không dùng từ khóa this bên trong các khối lệnh static.  
**4.Tạo đối tượng của một lớp bên trong lớp đó**  
Chúng ta có thể tạo những đối tượng của một lớp bên trong chính lớp đó. Ví dụ:  
```java
class Lamp {
    boolean isOn;
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        led.turnOn();
    }
}
```
Đối tượng led thuộc lớp Lamp được tạo bên trong hàm main() của lớp Lamp.  
**III/ Static**  
Trong Java, khi khai báo và định nghĩa lớp (class), các thuộc tính được khai báo với từ khóa static gọi là thuộc tính tĩnh (static). Đặc điểm của thuộc tính này là nó thuộc về lớp chứ không phải thuộc về từng đối tượng của lớp.  
Khi khởi tạo đối tượng của lớp thì mỗi đối tượng được cấp một vùng nhớ riêng để lưu trữ những thuộc tính dữ liệu của nó. Nhưng với thuộc tính static thì tất cả các đối tượng của lớp sử dụng chung thuộc tính này.  
Một đối tượng của lớp thay đổi giá trị của thuộc tính static thì các đối tượng khác của lớp cũng nhận sự thay đổi của thuộc tính static này.  
Cú pháp khai báo thuộc tính static:
```java
accessmodifier static <kiểudữliệu> tênthuộctính;
```
**IV/ Constructor**  
Hàm khởi tạo (constructor) trong Java là một hàm có tên giống với tên lớp. Hàm này được gọi khi khởi tạo đối tượng. Hàm khởi tạo không có kiểu trả về. Ví dụ:  
```java
class Test {
  Test() {
    // constructor body
  }
}
```
Hàm khởi tạo được gọi khi khởi tạo đối tượng của lớp. Hàm khởi tạo có 2 đặc điểm là:  
- Tên của hàm khởi tạo cùng tên với tên của lớp  
- Hàm khởi tạo trong Java không có kiểu trả về (kể cả void)  
Nếu một lớp không có hàm khởi tạo, trình biên dịch Java sẽ tự động tạo ra một hàm khởi tạo mặc định không có tham số. Hàm khởi tạo mặc định này sẽ tự khởi tạo các thuộc tính của đối tượng với các giá trị mặc định.  

Có thể chia hàm khởi tạo thành 3 loại:  
1. Hàm khởi tạo không có tham số (no-argument constructor)  
2. Hàm khởi tạo có tham số (parameterized constructor)  
3. Hàm khởi tạo mặc định (default constructor)  
Hàm khởi tạo không thể khai báo với từ khóa abstract, static hoặc final.  
Hàm khởi tạo có thể được nạp chồng nhưng không thể được ghi đè trong lớp con khi kế thừa.  
**V/ Getter & Setter**  
Trong Java, getter và setter là hai phương thức quan trọng được sử dụng để truy cập và thay đổi giá trị của các thuộc tính (biến) của lớp, đặc biệt khi các thuộc tính đó được khai báo với phạm vi truy cập là private. Việc sử dụng getter và setter là một phần của khái niệm đóng gói (encapsulation) trong lập trình hướng đối tượng (OOP), giúp bảo vệ dữ liệu và kiểm soát cách dữ liệu được truy cập hoặc thay đổi.  
Getter  
Getter là phương thức được sử dụng để lấy giá trị của một thuộc tính. Nó thường có tên bắt đầu với từ "get" theo sau là tên của thuộc tính với chữ cái đầu tiên viết hoa.  
Setter  
Setter là phương thức được sử dụng để đặt giá trị cho một thuộc tính. Nó thường có tên bắt đầu với từ "set" theo sau là tên của thuộc tính với chữ cái đầu tiên viết hoa.  
Cấu trúc của getter và setter  
Ví dụ về getter và setter:  
```java
//Giả sử chúng ta có một lớp Person với một thuộc tính name:
public class Person {
    // Thuộc tính được khai báo private để bảo vệ dữ liệu
    private String name;

    // Getter cho thuộc tính name
    public String getName() {
        return name;
    }

    // Setter cho thuộc tính name
    public void setName(String name) {
        this.name = name;
    }
}
```
Trong ví dụ trên:  
•	Getter getName(): Trả về giá trị của thuộc tính name. Nó giúp các lớp khác có thể lấy giá trị của name mà không cần truy cập trực tiếp vào biến name.  
•	Setter setName(String name): Cho phép các lớp khác gán giá trị cho thuộc tính name. Việc thay đổi giá trị name phải thông qua phương thức này, giúp đảm bảo dữ liệu được kiểm soát.  
Sử dụng getter và setter trong chương trình:  
```java
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person();

        // Sử dụng setter để đặt giá trị cho thuộc tính name
        person.setName("John Doe");

        // Sử dụng getter để lấy giá trị của thuộc tính name
        System.out.println("Name: " + person.getName());
    }
}
```
Lợi ích của việc sử dụng getter và setter  
1.	Kiểm soát dữ liệu: Getter và setter cho phép kiểm soát cách dữ liệu được truy xuất và thay đổi. Bạn có thể thêm logic kiểm tra giá trị trước khi thay đổi hoặc trả về, giúp ngăn chặn các giá trị không hợp lệ.  
2.	Bảo vệ dữ liệu: Các thuộc tính được đặt private để đảm bảo chúng không bị truy cập hoặc thay đổi trực tiếp từ bên ngoài lớp. Getter và setter cung cấp cách thức an toàn để truy cập các thuộc tính đó.  
3.	Tính linh hoạt: Bạn có thể thay đổi cách xử lý hoặc tính toán giá trị của thuộc tính trong getter hoặc setter mà không ảnh hưởng đến các phần khác của chương trình.  
4.	Tuân thủ nguyên tắc OOP: Getter và setter giúp thực thi nguyên tắc đóng gói trong lập trình hướng đối tượng, đảm bảo rằng các dữ liệu nội bộ của một lớp chỉ được truy cập theo cách có kiểm soát.  
