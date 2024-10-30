- [Mọi thứ đều là đối tượng](#mọi-thứ-đều-là-đối-tượng)
  - [I/ Tính đóng gói.](#i-tính-đóng-gói)
    - [1/ Tại sao cần tính đóng gói?](#1-tại-sao-cần-tính-đóng-gói)
    - [2/ Ví dụ với Java.](#2-ví-dụ-với-java)
  - [II/ Tính kế thừa.](#ii-tính-kế-thừa)
    - [1/ Tính kế thừa là gì?](#1-tính-kế-thừa-là-gì)
    - [2/ Cú pháp kế thừa trong Java.](#2-cú-pháp-kế-thừa-trong-java)
    - [3/ Từ khóa super](#3-từ-khóa-super)
      - [a/ Phân biệt các thành phần có cùng tên giữa lớp cha và lớp con.](#a-phân-biệt-các-thành-phần-có-cùng-tên-giữa-lớp-cha-và-lớp-con)
      - [b/ Gọi hàm tạo của lớp cha.](#b-gọi-hàm-tạo-của-lớp-cha)
    - [4/ Variable hiding \& Variable shadowing](#4-variable-hiding--variable-shadowing)
      - [a/ Variable hiding](#a-variable-hiding)
      - [b/ Variable shadowing](#b-variable-shadowing)
    - [5/ Các loại kế thừa trong Java](#5-các-loại-kế-thừa-trong-java)
      - [a/ Đơn kế thừa](#a-đơn-kế-thừa)
      - [b/ Kế thừa đa cấp](#b-kế-thừa-đa-cấp)
      - [c/ Kế thừa thứ bậc](#c-kế-thừa-thứ-bậc)
    - [6/ Đa kế thừa trong Java](#6-đa-kế-thừa-trong-java)
      - [a/ Abstract và interface trong Java](#a-abstract-và-interface-trong-java)
        - [\*/ Abstract](#-abstract)
        - [\*/ Interface](#-interface)
      - [b/ Đa kế thừa trong Java](#b-đa-kế-thừa-trong-java)
      - [c/ Kế thừa Interface trong Java](#c-kế-thừa-interface-trong-java)
  - [III/ Upcasting va Downcasting](#iii-upcasting-va-downcasting)
    - [1/ Upcasting](#1-upcasting)
    - [2/ Downcasting](#2-downcasting)
  - [IV/ Class Object](#iv-class-object)
  - [V/ Tính đa hình](#v-tính-đa-hình)
  - [VI/ Đa hình runtime và compile time](#vi-đa-hình-runtime-và-compile-time)
    - [1/ Đa hình runtime](#1-đa-hình-runtime)
    - [2/ Đa hình compile time](#2-đa-hình-compile-time)
  - [VII/ Overload và Override](#vii-overload-và-override)
    - [1/ Ghi đè phương thức (method overriding)](#1-ghi-đè-phương-thức-method-overriding)
    - [2/ Nạp chồng phương thức (method overloading)](#2-nạp-chồng-phương-thức-method-overloading)
      - [a/Nạp chồng phương thức: thay đổi số lượng các tham số](#anạp-chồng-phương-thức-thay-đổi-số-lượng-các-tham-số)
      - [b/ Nạp chồng phương thức: thay đổi kiểu dữ liệu của các tham số](#b-nạp-chồng-phương-thức-thay-đổi-kiểu-dữ-liệu-của-các-tham-số)
    - [3/ Sự khác nhau giữa overloading và overriding trong java](#3-sự-khác-nhau-giữa-overloading-và-overriding-trong-java)

# Mọi thứ đều là đối tượng

## I/ Tính đóng gói.

- Tính đóng gói (Encapsulation) là một trong những nguyên tắc quan trọng trong Lập Trình Hướng Đối Tượng (OOP). Nguyên tắc này đề cập đến việc che giấu thông tin và hành vi bên trong đối tượng, chỉ tiết lộ những gì cần thiết và quy định cách truy cập thông qua các phương thức công khai.

### 1/ Tại sao cần tính đóng gói?

- Trong lập trình, tính đóng gói giúp bảo vệ dữ liệu và tránh truy cập trực tiếp đến các thuộc tính của đối tượng từ bên ngoài. Điều này có ích trong việc quản lý và bảo vệ dữ liệu, đồng thời cho phép kiểm soát cách các thành phần khác nhau tương tác với đối tượng đó.
  
### 2/ Ví dụ với Java.

- Chúng ta hãy tưởng tượng một lớp đại diện cho một người trong Java. Chúng ta sẽ sử dụng tính đóng gói để bảo vệ thông tin cá nhân như tên và tuổi của người đó.

```java
public class Person {
    private String name;  // Thuộc tính name là private
    private int age;      // Thuộc tính age là private

    // Phương thức khởi tạo
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức công khai để lấy tên
    public String getName() {
        return name;
    }

    // Phương thức công khai để lấy tuổi
    public int getAge() {
        return age;
    }

    // Phương thức công khai để thay đổi tuổi
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

- Trong ví dụ này, thuộc tính name và age được khai báo là private, nghĩa là chúng không thể truy cập trực tiếp từ bên ngoài lớp Person. Để lấy hoặc thay đổi giá trị của chúng, chúng ta sử dụng các phương thức công khai getName, getAge, và setAge.

- Như bạn thấy, thông tin cá nhân của người được che giấu bên trong lớp Person, và bạn chỉ có thể truy cập thông qua các phương thức công khai. Điều này giúp đảm bảo rằng dữ liệu của người không bị sửa đổi hoặc truy cập một cách không kiểm soát.

- Tính đóng gói là một nguyên tắc mạnh mẽ trong OOP, giúp tạo ra mã nguồn dễ bảo trì và an toàn hơn bằng cách quản lý truy cập đến thông tin của đối tượng.

## II/ Tính kế thừa.

### 1/ Tính kế thừa là gì?

- Thử nghĩ chúng ta có các lớp `Class mayAsus`, `Class mayAcer`, `Class mayLenovo` đều có các thuộc tính (attribute): `chieudai`, `chieurong` và phương thức (method):  `upRam()`. Khi đó, nếu chúng ta tạo các lớp này thì chúng ta phải viết trong mỗi lớp đều có 3 phương thức trên. Hơn thế nữa, nếu bạn muốn sửa lại code trong một phương thức nào đó thì bạn phải sửa chúng cả ở 3 lớp sẽ rất tốn thời gian, và có thể dễ sai sót. Vì thế tính kế thừa sẽ được sử dụng trong trường hợp này để giải quyết vấn đề trên. 

- Tính kế thừa cho phép xây dựng một lớp mới dựa trên các định nghĩa của lớp đã có. Có nghĩa là lớp cha có thể chia sẽ dữ liệu và phương thức cho các lớp con. Các lớp con khỏi phải định nghĩa lại, ngoài ra có thể mở rộng các thành phần kế thừa và bổ sung thêm các thành phần mới. Tái sử dụng mã nguồn 1 cách tối ưu, tận dụng được mã nguồn.

### 2/ Cú pháp kế thừa trong Java.

```Java
class Subclass-name extends Superclass-name {  
   //methods and fields
}  
```

- Ví dụ về kế thừa trong Java

```Java
class Employee {
    float salary = 1000;
}
 
class Programmer extends Employee {
    int bonus = 150;
}
 
public class InheritanceSample1 {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
```
- Kết quả:

```
Programmer salary is: 1000.0
Bonus of Programmer is: 150
```

### 3/ Từ khóa super

- Từ khóa `super` được sử dụng trong các trường hợp sau:

  + Nó được sử dụng để phân biệt các thành phần có cùng tên giữa lớp cha và lớp con.

  + Nó được sử dụng để gọi hàm tạo của lớp cha từ lớp con.

#### a/ Phân biệt các thành phần có cùng tên giữa lớp cha và lớp con.

- Nếu chúng ta có một lớp con thừa kế từ một lớp cha và các thành phần của lớp cha có cùng tên với các thành phần của lớp con thì để phân biệt các thành phần của lớp cha từ lớp con, chúng ta sẽ sử dụng từ khóa `super` với cú pháp như sau:

```Java
super.tên_thuộc_tính;
super.tên_phương_thức();
```

- Ví dụ:

```Java
public class Superclass {
    int number = 10;
 
    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp cha");
    }
}
```

```Java
public class Subclass extends Superclass {
    int number = 20;
 
    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp con");
    }
     
    public void subclassMethod() {
        Subclass subclass = new Subclass();
         
        // gọi phương thức hienThi() của lớp cha
        // sử dụng từ khóa super()
        super.hienThi();
         
        // gọi phương thức hienThi() của lớp con
        subclass.hienThi();
         
        // hiển thị giá trị biến number của lớp cha
        System.out.println("Giá trị biến number của lớp cha = " + super.number);
         
        // hiển thị giá trị biến number của lớp con
        System.out.println("Giá trị biến number của lớp con = " + subclass.number);
    }
 
 
    public static void main(String[] args) {
        Subclass objSubclass = new Subclass();
        objSubclass.subclassMethod();
    }
 
}
```

- Kết quả hiển thị:

```
Đây là phương thức hienThi() của lớp cha
Đây là phương thức hienThi() của lớp con
Giá trị biến number của lớp cha = 10
Giá trị biến number của lớp con = 20
```

- Trong ví dụ này chúng ta có 2 lớp: lớp cha tên là `Superclass` và lớp con tên là `Subclass`. Hai lớp này cùng có một phương thức tên là `hienThi()` với nội dung phương thức khác nhau và cùng có một biến `number` với giá trị biến khác nhau. Trong lớp `Subclass` chúng ta sẽ tiến hành gọi đến phương thức `hienThi()` và thuộc tính `number` của 2 lớp này. Đối với thuộc tính và phương thức của lớp `Superclass`, chúng ta sẽ gọi thông qua từ khóa `super` với 2 dòng code là `super.hienThi()` và `super.number`, còn đối với thuộc tính và phương thức của lớp `Subclass` thì chúng ta gọi bình thường thông qua tên đối tượng của nó.

#### b/ Gọi hàm tạo của lớp cha.

- Nếu chúng ta có 1 lớp là lớp con của một lớp khác thì lớp con đó có thể tự động gọi được hàm tạo mặc định của lớp cha. Nhưng trong trường hợp chúng ta muốn gọi hàm tạo có đối số của lớp cha, chúng ta cần sử dụng từ khóa `super` với cú pháp như sau:

```Java
super(tên_đối_số);
```

> Lưu ý: từ khóa `super` trong trường hợp này chỉ có thể được dùng ngay trong hàm tạo và phải được khai báo đầu tiên bên trong hàm tạo đó, nếu chúng ta để nó vào trong các phương thức bình thường khác thì hệ thống sẽ báo lỗi.

- Ví dụ: 

```Java
public class Superclass {
     
    public Superclass(int number) {
        System.out.println("Đây là hàm tạo có đối số của lớp Superclass, giá trị biến number = " + number);
    }
}
```

```Java
public class Subclass extends Superclass {
 
    public Subclass(int number) {
        super(number);  // gọi hàm tạo của lớp Superclass
        System.out.println("Đây là hàm tạo của lớp Subclass, giá trị biến number = " + number);
    }
 
    public static void main(String[] args) {
        Subclass subclass = new Subclass(10);
    }
 
}
```

- Kết quả:

```Java
Đây là hàm tạo có đối số của lớp Superclass, giá trị biến number =  10
Đây là hàm tạo của lớp Subclass, giá trị biến number = 10
```

### 4/ Variable hiding & Variable shadowing

#### a/ Variable hiding

- **Variable hiding**` xảy ra khi một biến của lớp con có cùng tên với biến của lớp cha, và biến của lớp con "che khuất" biến của lớp cha. Trong trường hợp này, khi truy cập biến đó từ lớp con, Java sẽ ưu tiên biến của lớp con, không phải biến của lớp cha.

- Ví dụ:

```Java
class Parent {
    public int x = 10;
}

class Child extends Parent {
    public int x = 20;

    public void display() {
        System.out.println("Child x = " + x); // Sẽ in ra 20
        System.out.println("Parent x = " + super.x); // Sẽ in ra 10
    }
}
```

- Trong ví dụ này:

  + `Child.x` che khuất `Parent.x`. Khi truy cập `x` trong lớp `Child`, giá trị của `Child.x` được ưu tiên hơn.

  + Tuy nhiên, bạn có thể dùng từ khóa `super` để truy cập `Parent.x`.

#### b/ Variable shadowing

- Variable shadowing xảy ra trong trường hợp biến cục bộ trong một phương thức có cùng tên với một biến instance (biến thành viên) của lớp chứa nó. Biến cục bộ sẽ "che khuất" biến instance, và khi truy cập tên biến đó trong phương thức, biến cục bộ sẽ được ưu tiên.

- Ví dụ:

```Java
class Example {
    int x = 10;

    public void show() {
        int x = 20;
        System.out.println("Local x = " + x); // Sẽ in ra 20
        System.out.println("Instance x = " + this.x); // Sẽ in ra 10
    }
}
```

- Trong ví dụ này:

  + Biến cục bộ `x` trong phương thức `show` che khuất biến instance `x` của lớp.

  + Để truy cập biến instance, bạn có thể sử dụng từ khóa `this`.

### 5/ Các loại kế thừa trong Java

#### a/ Đơn kế thừa

```Java
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
 
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
 
public class TestInheritance1 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
```

```Java
barking...
eating...
```

#### b/ Kế thừa đa cấp

```Java
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
 
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
 
class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}
 
public class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
```

```Java
weeping...
barking...
eating...
```

#### c/ Kế thừa thứ bậc

```Java
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
 
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
 
class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}
 
public class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark(); // compile error
    }
}
```

```Java
meowing...
eating...
```

### 6/ Đa kế thừa trong Java

#### a/ Abstract và interface trong Java

##### */ Abstract

- Một lớp được khai báo với từ khóa `abstract` là lớp `abstract` trong Java. Lớp `abstract` có nghĩa là lớp trừu tượng, nó có thể có các phương thức `abstract` hoặc non-abtract.

- Tính trừu tượng là một tiến trình ẩn các cài đặt chi tiết và chỉ hiển thị tính năng tới người dùng.

- Nói cách khác, nó chỉ hiển thị các thứ quan trọng tới người dùng và ẩn các chi tiết nội tại, ví dụ: để gửi tin nhắn, người dùng chỉ cần soạn text và gửi tin. Bạn không biết tiến trình xử lý nội tại về phân phối tin nhắn.

- Tính trừu tượng giúp bạn trọng tâm hơn vào đối tượng thay vì quan tâm đến cách nó thực hiện.

- Một phương thức được khai báo là `abstract` và không có trình triển khai thì đó là phương thức trừu tượng. Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng bạn muốn triển khai thực sự phương thức đó để được quyết định bởi các lớp con, thì bạn có thể khai báo phương thức đó trong lớp cha ở dạng `abstract`.

- Từ khóa `abstract` được sử dụng để khai báo một phương thức dạng `abstract`. Một phương thức abstract không có thân phương thức. Phương thức `abstract` sẽ không có định nghĩa, được theo sau bởi dấu chấm phảy, không có dấu ngoặc nhọn theo sau:

```Java
// Khai bao phuong thuc voi tu khoa abstract va khong co than phuong thuc
abstract void printStatus();
```

- Ví dụ:

```Java
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
    void run() {
        System.out.println("running safely..");
    }
 
    public static void main(String args[]) {  
        Bike obj = new Honda4();  
        obj.run();  
    }  
}  
```

- Kết quả:

> running safely..

##### */ Interface

- Một Interface trong Java là một bản thiết kế của một lớp. Nó chỉ có các phương thức trừu tượng. Interface là một kỹ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java. Interface trong Java cũng biễu diễn mối quan hệ IS-A. Nó không thể được khởi tạo giống như lớp trừu tượng.

- Nói cách khác, các trường của Interface là `public`, `static` và `final` theo mặc định và các phương thức là `public` và `abstract`.

- Một Interface trong Java là một tập hợp các phương thức trừu tượng (abstract). Một class triển khai một interface, do đó kế thừa các phương thức abstract của interface.

- Một interface không phải là một lớp. Viết một interface giống như viết một lớp, nhưng chúng có 2 định nghĩa khác nhau. Một lớp mô tả các thuộc tính và hành vi của một đối tượng. Một interface chứa các hành vi mà một class triển khai.

- Một interface khác với một class ở một số điểm sau đây:

  + Bạn không thể khởi tạo một interface.

  + Một interface không chứa bất cứ hàm Contructor nào.

  + Tất cả các phương thức của interface đều là abstract.

  + Một interface không thể chứa một trường nào trừ các trường vừa static và final.

  + Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.

  + Một interface có thể kế thừa từ nhiều interface khác.

- Ví dụ:

```Java
interface printable {  
    void print();  
}  
   
class A6 implements printable {  
    public void print() {
        System.out.println("Hello");
    }  
   
    public static void main(String args[]){  
        A6 obj = new A6();  
        obj.print();  
    }
}   
```

- Trong ví dụ này, printable interface chỉ có một phương thức, trình triển khai của nó được cung cấp bởi lớp A6.

- Khi triển khai interface, có vài quy tắc sau:

  + Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm.

  + Một lớp chỉ có thể kế thừa một lớp khác, nhưng được triển khai nhiều interface.

  + Một interface có thể kế thừa từ một interface khác, tương tự cách một lớp có thể kế thừa lớp khác.

#### b/ Đa kế thừa trong Java

- Để giảm thiểu sự phức tạp và đơn giản hóa ngôn ngữ, đa kế thừa không được support trong java.

- Hãy suy xét kịch bản sau: Có 3 lớp A, B, C. Trong đó lớp C kế thừa từ các lớp A và B. Nếu các lớp A và B có phương thức giống nhau và bạn gọi nó từ đối tượng của lớp con, như vậy khó có thể xác đinh được việc gọi phương thức của lớp A hay B.

- Vì thế, rong java, đa kế thừa chỉ được support thông qua interface.

- Nếu một lớp triển khai đa kế thừa, hoặc một Interface kế thừa từ nhiều Interface thì đó là đa kế thừa.

- Ví dụ:

```Java
interface Printable {  
    void print();  
}  
   
interface Showable{  
    void show();  
}  
   
class A7 implements Printable,Showable {  
   
    public void print() {
        System.out.println("Hello");
    }  
    public void show() {
        System.out.println("Welcome");
    }  
   
    public static void main(String args[]){  
        A7 obj = new A7();  
        obj.print();  
        obj.show();  
    }  
}  
```

#### c/ Kế thừa Interface trong Java

```Java
interface Printable{  
    void print();  
}  
interface Showable extends Printable{  
    void show();  
}  
class Testinterface2 implements Showable{  
   
    public void print() {
        System.out.println("Hello");
    }  
    public void show() {
        System.out.println("Welcome");
    }  
   
    public static void main(String args[]){  
        Testinterface2 obj = new Testinterface2();  
        obj.print();  
        obj.show();  
    }  
}  
```

## III/ Upcasting va Downcasting

- Ta có đoạn chương trình sau:

```Java
class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}
 
public class Cat extends Animal {
    public void meow() {
        System.out.println("meowing...");
    }
}
```

### 1/ Upcasting

- Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con, thì đó là Upcasting.

```Java
public class Upcasting {
 
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = cat; // Chuyển kiểu không tường minh
        Animal animal2 = (Animal) cat; // Chuyển kiểu tường minh
 
        cat.eat();
        cat.meow();
        animal1.eat();
        animal2.eat();
        // animal2.meow(); // Không thể gọi phương thức meow()
    }
 
}
```
- Kết quả là:

```Java
eating...
meowing...
eating...
eating...
```

- Với nội dung hàm main như trên, ta đã thực hiện upcasting khi gán đối tượng `cat` thuộc lớp `Cat` cho đối tượng `animal1` và `animal2` thuộc lớp `Animal`.

- Đối với upcasting, chúng ta hoàn toàn có thể sử dụng chuyển kiểu tường mình hoặc không tường minh, cả hai cách đều được chấp nhận.

> Một lưu ý nhỏ: Mọi phương thức của lớp Animal hoàn toàn có thể gọi qua 1 đối tượng thuộc lớp Cat do giữa Animal và Cat có quan hệ IS_A. Tuy nhiên, nếu thực hiện override bất kỳ phương thức nào của lớp Animal tại lớp Cat thì trong quá trình runtime hàm được gọi sẽ là hàm của lớp Cat .

- Quay trở lại ví dụ phía trên. Nếu trong lớp Cat, thực hiện override hàm eat như sau:

```Java
public class Cat extends Animal {
 
    @Override
    public void eat() {
        System.out.println("Eat meat");
    }
 
    public void meow() {
        System.out.println("meowing...");
    }
     
}
```

- Kết quả thực thi sẽ là:

```
Eat meat
meowing...
Eat meat
Eat meat
```

### 2/ Downcasting

- Khác với upcasting, Downcasting là dạng chuyển kiểu chuyển 1 đối tượng là một thể hiện của lớp cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.

- Thông thường, khi thực hiện dòng mã nguồn:

```Java
Animal cat = new Cat();
```

- Ta hoàn toàn có thể gọi những phương thức đã được override của lớp Animal tại lớp Cat qua đối tượng animal. Tuy nhiên, vấn đề phát sinh khi ta muốn gọi mọi phương thức của lớp Cat thông qua việc ép kiểu đối tượng thuộc lớp Animal. Khi đó, ta sử dụng downcasting .

```Java
public class Downcating {
 
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal; // downcasting
        cat.meow();
    }
 
}
```

- Ta thấy, meow() là phương thức chỉ có ở lớp Cat. Tuy nhiên, thông qua downcasting ta hoàn toàn có thể gọi ra phương thức đó thông qua đối tượng cat mà không cần new Cat() bằng việc downcasting đối tượng animal có kiểu Animal mà không xảy ra vấn đề trong quá trình biên dịch (compile) và thực thi (runtime).

## IV/ Class Object

- Mặc định lớp Object là lớp cha của tất cả các lớp trong java. Nói cách khác nó là một lớp cáo nhất trong java.

- Sử dụng lớp Object là hữu ích nếu ta muốn tham chiếu bất kỳ đối tượng nào mà bạn chưa biết kiểu dữ liệu của đối tượng đó.

- Ví dụ: giả sử phương thức getObject() trả về một đối tượng nhưng nó có thể là bất kỳ kiểu nào như Employee,Student, ... chúng ta có thể sử dụng biến tham chiếu của lớp Object để tham chiếu tới đối tượng đó.

```Java
Object obj=getObject(); 
// chúng ta không biết đối tượng gì được trả về từ phương thức này.
```

- Lớp Object cung cấp một vài cách xử lý chung cho tất cả các đối tượng như đối tượng có thể được so sánh, đối tượng có thể được cloned, đối tượng có thể được notified...

- Các phương thức của lớp Object:

|Phương thức|Mô tả|
|---|---|
|public final Class getClass()|trả về đối tượng lớp Class của đối tượng hiện tại. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.|
|public int hashCode()|trả về số hashcode cho đối tượng hiện tại.|
|protected Object clone() throws CloneNotSupportedException|tạo và trả về bản sao chép (clone) của đối tượng hiện tại.|
|public String toString()|trả về chuỗi ký tự đại diện của đối tượng hiện tại.|
|public final void notify()|đánh thức một luồng, đợi trình giám sát của đối tượng hiện tại.|
|public final void notifyAll()|đánh thức tất cả các luồng, đợi trình giám sát của đối tượng hiện tại.|
|public final void wait(long timeout)throws InterruptedException|làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).|
|public final void wait(long timeout,int nanos)throws InterruptedException|làm cho Thread hiện tại đợi trong khoảng thời gian là số mili giây và nano giây cụ thể, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).|
|public final void wait()throws InterruptedException|làm Thread hiện tại đợi, tới khi Thread khác thông báo (gọi phương thức notify() hoặc notifyAll()).|
|protected void finalize()throws Throwable|Được gọi bởi Garbage Collector trước khi đối tượng bị dọn rác.|

## V/ Tính đa hình

- Đa hình trong java (Polymorphism) là một khái niệm mà chúng ta có thể thực hiện một hành động bằng nhiều cách khác nhau. Polymorphism được cấu tạo từ 2 từ Hy Lạp: poly và morphs. Trong đó "poly" có nghĩa là nhiều và "morphs" có nghĩa là hình thể. Vậy polymorphism có nghĩa là nhiều hình thể.

- Có hai kiểu của đa hình trong java, đó là đa hình lúc biên dịch (compile) và đa hình lúc thực thi (runtime). Chúng ta có thể thực hiện đa hình trong java bằng cách nạp chồng phương thức và ghi đè phương thức.

- Ví dụ về tính đa hình:

```Java
public class Shape {
    public void show() {
        System.out.println("Đây là phương thức show() của lớp Shape");
    }
}
```

```Java
public class Rectangle extends Shape {
    public void show() {
        System.out.println("Đây là phương thức show() của lớp Rectangle");
    }
}
```

```Java
public class Square extends Shape {
    public void show() {
        System.out.println("Đây là phương thức show() của lớp Square");
    }
}
```

```Java
public class Main {
 
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Shape"
         
        // bản chất của shape là Shape, nhưng vì khai báo Rectangle nên chúng ta chỉ nhìn thấy những gì mà Rectangle có
        // vì vậy sẽ chạy những hàm của Rectangle
        shape = new Rectangle();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Rectangle"
         
        // tương tự lúc này shape sẽ đóng vai trò là 1 Square
        shape = new Square();
        shape.show();   // hiển thị dòng "Đây là phương thức show() của lớp Square"
    }
 
}
```

## VI/ Đa hình runtime và compile time

### 1/ Đa hình runtime

- Đa hình lúc runtime là quá trình gọi phương thức đã được ghi đè trong thời gian thực thi chương trình. Trong quá trình này, một phương thức được ghi đè được gọi thông qua biến tham chiếu của một lớp cha.

- Ví dụ: Chúng ta tạo hai lớp Bike và Splendar. Lớp Splendar kế thừa lớp Bike và ghi đè phương thức run() của nó. Chúng ta gọi phương thức run bởi biến tham chiếu của lớp cha. Khi nó tham chiếu tới đối tượng của lớp con và phương thức lớp con ghi đè phương thức của lớp cha, phương thức lớp con được gọi lúc runtime.

- Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler, vì thế đó là đa hình lúc runtime.

```Java
class Bike {
    void run() {
        System.out.println("running");
    }
}
 
public class Splender extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
 
    public static void main(String args[]) {
        Bike b = new Splender();// upcasting
        b.run();
    }
}
```

- Kết quả:

> running safely with 60km

### 2/ Đa hình compile time

- Bất cứ khi nào một đối tượng bị ràng buộc với chức năng của chúng tại thời gian biên dịch thì được gọi là đa hình thời gian biên dịch. Tại thời gian biên dịch, java biết nên gọi phương thức nào bằng cách kiểm tra chữ ký của phương thức. Vì vậy, điều này được gọi là đa hình thời gian biên dịch hoặc liên kết tĩnh.

- Đa hình thời gian biên dịch đạt được thông nạp chồng phương thức (Overloading). Nạp chồng phương thức (Overloading) cho biết bạn có thể có nhiều hơn một hàm có cùng tên trong một lớp có một nguyên mẫu khác nhau. Nạp chồng phương thức là một trong những cách để đạt được đa hình nhưng nó phụ thuộc vào công nghệ mà chúng ta áp dụng loại đa hình nào. Sau đây là một ví dụ trong đó đa hình thời gian biên dịch.

```Java
// Java program to demonstrate 
// compile-time polymorphism 
public class GFG { 
  
    // First addition function 
    public static int add(int a, int b) 
    { 
        return a + b; 
    } 
  
    // Second addition function 
    public static double add(double a, double b) 
    { 
        return a + b; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // Here, the first addition 
        // function is called 
        System.out.println(add(2, 3)); 
  
        // Here, the second addition 
        // function is called 
        System.out.println(add(2.0, 3.0)); 
    } 
} 
```

## VII/ Overload và Override

### 1/ Ghi đè phương thức (method overriding)

- Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.

- Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè phương thức (method overriding) trong java.

- Sử dụng ghi đè phương thức trong java:

  + Ghi đè phương thức được sử dụng để cung cấp cài đặt đặc biệt của một phương thức mà đã được định nghĩa ở lớp cha.

  + Ghi đè phương thức được sử dụng cho đa hình runtime.

- Các nguyên tắc ghi đè phương thức trong java:

  + Phương thức phải có tên giống với lớp cha.

  + Phương thức phải có tham số giống với lớp cha.

  + Lớp con và lớp cha có mối quan hệ kế thừa.

- Ví dụ:

```Java
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
 
public class Bike2 extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
 
    public static void main(String args[]) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
```

- Kết quả:

> running safely with 60km

> **Note:** Phương thức static không thể ghi đè vì phương thức static được ràng buộc với class còn phương thức instance được ràng buộc với đối tượng. Static thuộc về vùng nhớ class còn instance thuộc về vùng nhớ heap.

### 2/ Nạp chồng phương thức (method overloading)

- Nạp chồng phương thức trong java xảy ra nếu một lớp có nhiều phương thức có tên giống nhau nhưng khác nhau về kiểu dữ liệu hoặc số lượng các tham số.

- Giả sử bạn phải thực hiện tính tổng của các số đã cho với bất kỳ số lượng các đối số, nếu bạn viết phương thức a(int, int) cho 2 tham số, b(int, int, int) cho 3 tham số điều này có thể gây khó hiểu cho các lập trình viên khác về ý nghĩa của các phương thức đó vì chúng có tên khác nhau.

- Có 2 cách nạp chồng phương thức trong java

  + Thay đổi số lượng các tham số

  + Thay đổi kiểu dữ liệu của các tham số

#### a/Nạp chồng phương thức: thay đổi số lượng các tham số

- Trong ví dụ này, chúng ta cần tạo 2 phương thức, phương thức add() đầu tiên thực hiện việc tính tổng của 2 số, phương thức thứ hai thực hiện việc tính tổng của 3 số. Sử dụng phương thức static để gọi hàm thông qua tên class thay vì phải tạo thể hiên của lớp.

```Java
class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(11,11,11));  
    }
}  
```

- Kết quả:

> 22
> 33

#### b/ Nạp chồng phương thức: thay đổi kiểu dữ liệu của các tham số

- Trong ví dụ này, chúng ta sẽ tạo ra 2 phương thức có kiểu dữ liệu khác nhau. Phương thức add() đầu tiên nhận 2 đổi số có kiểu giá trị là integer, phương thức thứ hai nhận 2 đổi số có kiểu giá trị là double.

```Java
class Adder{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
    public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(12.3,12.6));  
    }
}  
```

- Kết quả:

> 22
> 24.9

### 3/ Sự khác nhau giữa overloading và overriding trong java

|Nạp chồng phương thức (overloading)|Ghi đè phương thức (overriding)|
|---|---|
|Nạp chồng phương thức được sử dụng để giúp code của chương trình dễ đọc hơn.|Ghi đè phương thức được sử dụng để cung cấp cài đặt cụ thể cho phương thức được khai báo ở lớp cha.|
|Nạp chồng được thực hiện bên trong một class.|Ghi đè phương thức xảy ra trong 2 class có quan hệ kế thừa.|
|Nạp chồng phương thức thì tham số phải khác nhau.|Ghi đè phương thức thì tham số phải giống nhau.|
|Nạp chồng phương thức là ví dụ về đa hình lúc biên dịch.|Ghi đè phương thức là ví dụ về đa hình lúc runtime.|
|Trong java, nạp chồng phương thức không thể được thực hiện khi chỉ thay đổi kiểu giá trị trả về của phương thức. Kiểu giá trị trả về có thể giống hoặc khác. Giá trị trả về có thể giống hoặc khác, nhưng tham số phải khác nhau.|Giá trị trả về phải giống nhau.|